
// * Aula 1 - Interface de Cotrole do World Server 3D
 //@author Wellington Barbosa - RA: 261612
 //@version  2.1.1
 //UNICAMP - IA941 - 2019

package ws3dcontroller;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ws3dproxy.CommandExecException;
import ws3dproxy.WS3DProxy;
import ws3dproxy.model.Creature;
import ws3dproxy.model.Leaflet;
import ws3dproxy.model.Thing;
import ws3dproxy.model.World;
import ws3dproxy.model.WorldPoint;

/**
 *
 * @author Wellington
 */
public class WS3D_Controller extends JFrame{
   
    private final JPanel container = new JPanel();
   
    private final JButton Bconectar = new JButton("Conectar");
    private final JButton Breset = new JButton("Reinicializar World3D");
    private final JButton Bfechar = new JButton("Fechar");
    
    private final JButton BIcriatura = new JButton("Criatura");
    private final JButton Bfood = new JButton("Comida");
    private final JButton Bcristais = new JButton("Cristais");
    
    private final JLabel bcontroles = new JLabel(new ImageIcon(getClass().getResource("/imagens/Controles.jpg")));
    
    public Socket conection;
    public PrintWriter comando = null;
    public BufferedReader entrada = null;
    public String inputLine, outputLine;
    
    static WS3DProxy proxy = new WS3DProxy();
    public Creature Creatura;
    public World wd = World.getInstance();
    public List<Thing> things;
    public List<Leaflet> leaflets;
    
    public JTextField ibt_ip = new JTextField();
    public JTextField ibt_porta = new JTextField();
    
// Metodo utilizando o KeyLsitener
    public void Acoes_Creature(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
            
                try {
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_UP:
                            Creatura.move(2, 2, 0);
                            break;
                            //Ira girar em sentido horario
                        case KeyEvent.VK_RIGHT:
                            Creatura.rotate(1.53);
                            break;
                            // Ira girar em sentido anto-horario
                        case KeyEvent.VK_LEFT:
                            Creatura.rotate(-1.53);
                            break;
                        case KeyEvent.VK_DOWN:
                            Creatura.move(-2, -2, 0);
                            break;
                            // Cria uma gaiola
                        case KeyEvent.VK_V:
                            Bgaiola();
                            wd.createDeliverySpot(100, 250);
                            break;
                            // Come um fruto peresivel ou não
                        case KeyEvent.VK_S:
                            Eat();
                            break;
                            // Pega os cristais
                        case KeyEvent.VK_D:
                            Put();
                            break;
                            // Finaliza o controller do WS3D
                        case KeyEvent.VK_Q:
                            System.exit(0);
                            break;
                            // Lista os leaflets necessarios para pegar
                        case KeyEvent.VK_Y:
                            BLista_Leaflts_Necessarios();
                            break;
                        // Verificar os estados de conclusão dos leaflets
                        case KeyEvent.VK_A:
                            BVerifica_se_Leaflets_ok();
                            break;
                        // Entrega dos leafles completos da criatura
                        case KeyEvent.VK_B:
                            BentregarLeaflets_in_DeliverySpot();
                            break;
                        case KeyEvent.VK_O:
                            double x = Creatura.getFuel();
                            System.out.println(Creatura.getPosition());
                        default:
                            break;
                    }
                    
                } catch (CommandExecException ex) {
                    Logger.getLogger(WS3D_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            @Override
            public void keyReleased(KeyEvent e){
            try {
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_UP:
                            Creatura.move(0, 0, 0);
                            break;
                        case KeyEvent.VK_RIGHT:
                            Creatura.rotate(0);
                            break;
                        case KeyEvent.VK_LEFT:
                            Creatura.rotate(0);
                            break;
                        case KeyEvent.VK_DOWN:
                            Creatura.move(0, 0, 0);
                            break;
                           default:
                                break;
                    }
                    
                } catch (CommandExecException ex) {
                    Logger.getLogger(WS3D_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        });
}
    
    WS3D_Controller(){
    
    Acoes_Creature();
    ibt_ip.setText("127.0.0.1");
    ibt_porta.setText("4011");
   
    Container container = getContentPane();
    container.setLayout(null);
    
    setTitle(" WS3D_MoverCR ");
    setSize(300 , 490);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
   
    Bconectar.setFocusable(false);
    Bconectar.setBounds(15, 30,110, 25);
    container.add(Bconectar);
    
    Breset.setFocusable(false);
    Breset.setBounds(50,60,170,25);
    container.add(Breset);
    
    Bfechar.setFocusable(false);
    Bfechar.setBounds(170, 30, 110, 25);
    container.add(Bfechar);
   
    Bcristais.setFocusable(false);
    Bcristais.setBounds(15, 100, 110, 25);
    container.add(Bcristais);
    
    Bfood.setFocusable(false);
    Bfood.setBounds(130,100,130, 25);
    container.add(Bfood);
   
    BIcriatura.setFocusable(false);
    BIcriatura.setBounds(15, 153, 110, 25);
    container.add(BIcriatura);
    
    bcontroles.setBounds(50, 200, 200, 260);
    container.add(bcontroles); 

//Chamada dos metodos e eventos    
    Bfechar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BfecharActionListener();
        }
    });
    BIcriatura.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            BCriaturaActionPerformed();
        }
    });
    Bconectar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BConectandoActionListener();
        }
    } );
    Bfood.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BfoodActionListener();
        }
    });
    Bcristais.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BcristaisActionListener();
        
        }
    });
    Breset.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BresetActionListener();
        }
    });
    }
    
    
    //Eventos dos Botoes
    private void BConectandoActionListener(){
       String ip = ibt_ip.getText();
            int porta = Integer.parseInt(ibt_porta.getText());
           
            try {
            conection = new Socket(ip,porta);
            comando = new PrintWriter( conection.getOutputStream());
            System.out.println("...Você está conectado...W3S");
            } catch (IOException ex) {
            System.out.println("Erro ao conectar"+ ex.getMessage());
            }
    }
    private void BfecharActionListener(){
// Linha para finalizar o WorldServer
    
         try {
            comando = new PrintWriter(conection.getOutputStream(), true);
        } catch (IOException ex) {
            System.out.println("World não finalizado "+ ex.getMessage());
        }
        comando.println("shutdown");
        System.out.println("World Server Finalizado - Acabou");
        
              
    }
    private void BresetActionListener(){
           
        try {
            wd.reset();
        } catch (CommandExecException ex) {
            System.err.println("Err in reset world: "+ex.getMessage());
            System.err.println(ex.getCause());
            
        }
    }
    
    // Metodo que verificar quais são os leaflets para coletar
    private void BLista_Leaflts_Necessarios(){
        // Pegando os leaflets gerados leo metodo genleaflets e atribuindo a uma lista, que será apresentada
        leaflets = Creatura.getLeaflets();
        // Realizando a entrega dos Leaflets no deliveri spoot
        // Poderiamos implementar um loop para que a entrega dos Leaflets possa ocorrer mais rapido
        // O metodo String.valueOF = ira converter o retorno do metodo get do leaflets para tipo long - String
        for (int i =0; i < leaflets.size(); i++){
            System.out.println(i +" "+ leaflets.get(i));
            //Creatura.deliverLeaflet(inputLine);
            //System.out.println("Lista do Leaflets: "+leaflets.get(i).getPayment());
            //System.out.println("Lista do Leaflets: "+leaflets.get(i).getItems().toString());              
        }
    }
    // Verifica se os leaflets já foram coletados
    private void BVerifica_se_Leaflets_ok(){
        if(leaflets.get(0).isCompleted() == false){
            System.out.println("Ainda há items para coletar: " + 0);
        } else {
            System.out.println("Tarefa concluida do Leaflet: " + 0);
        }
        
        if(leaflets.get(1).isCompleted() == false){
            System.out.println("Ainda há items para coletar: " + 1);
        } else {
            System.out.println("Tarefa concluida do Leaflet: " + 1);
        }
            
        if(leaflets.get(2).isCompleted() == false){
            System.out.println("Ainda há items para coletar: " + 2);
        } else {
            System.out.println("Tarefa concluida do Leaflet: " + 2);
        }
    }
    // Entregar os leaflets no delivery Spot
    private void BentregarLeaflets_in_DeliverySpot(){ 
        // Loop para percorrer a lista de leaflts
        for (int i =0; i < leaflets.size(); i++){
            try {// O metodo do leaflets.get(N) precisa para rodar a entrega da variavel que é incrementada no loop for (i)
                Creatura.deliverLeaflet(String.valueOf(leaflets.get(i).getID()));
            } catch (CommandExecException ex) {
                System.out.println("Não é possivel entregar o Leafltes: "+ ex);
                Logger.getLogger(WS3D_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Leaflets entregues");
        }
    }
    // A criatura inicializa gera automaticamente em sua inicialização os 
    private void BCriaturaActionPerformed(){
        try {
            // Criando a criatura no World Server
            Creatura = proxy.createCreature(100, 450, 0, 1);
            
            // Gerando uma lista de leflets ao iniciar a criatura
            Creatura.genLeaflet();
            
            // O metodo String.valueOF = ira converter o retorno do metodo get do leaflets para tipo long - String
            // Creatura.deliverLeaflet(String.valueOf(leaflets.get(0).getID()));
            //System.out.println("leaflet atual: "+ leaflets);
             
            Creatura.start();
             
             WorldPoint position = Creatura.getPosition();
             double pitch = Creatura.getPitch();
             double fuel = Creatura.getFuel();
             Creatura.move(0, 0, 0);
             // Inicialização do bau junto com a criatura
             wd.createDeliverySpot(5, 250);
        } catch (CommandExecException ex) {
                System.out.println(ex.getMessage());
        }
     
    }
    private void BfoodActionListener(){
        
        try {
            World.createFood(0, 200, 450);
            World.createFood(1, 340, 350);
            
        } catch (CommandExecException ex) {
            Logger.getLogger(WS3D_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    // method for created crystais
    private void BcristaisActionListener(){
        
        World.grow();
    }
    //Method for created Cage
    private void Bgaiola(){
        try {
            wd.createCage(230, 500);
        } catch (CommandExecException ex) {
            System.err.println("Err in createCage: "+ex.getMessage());
        }
    }
    // Visualização das coisas no mapa
    private Thing things_Vison(){
        Thing a = null;
      
        Creatura.updateState();
      List<Thing> LThings = Creatura.getThingsInVision();
      for (int i = 0; i < LThings.size(); i++){
          a = LThings.get(i);
  // O print ira verificar todas as coisas no campo de visão da criatura
//System.out.println("Things: "+ a);
          if (Creatura.calculateDistanceTo(a) < 30){
              
          }
      }  
        return a;
   }  
    // Pegar Thigs
    private void Put(){
        String a = things_Vison().toString();
        
        try {
            //System.out.println("Put "+a);
            Creatura.putInSack(a);
          //  Creatura.deliverLeaflet(a);
        } catch (CommandExecException ex) {
            System.out.println("Não há crystais");
        } catch (NullPointerException es){
            System.out.println("Nada para pegar"+es.toString());
        }
    
    }
    // Comer Thigs
    private void Eat(){
        String a = things_Vison().toString();
        if (a.substring(0) == "J"){
            System.out.println("Isso não é comestivel");
        } else{
            try {
                //System.out.println("Eat "+a);
                Creatura.eatIt(a);
            } catch (CommandExecException ex) {
                System.err.println("Err in Eat: "+ex.getMessage());
            }
        }
    }
    private void Hided(){
        String dthing = things_Vison().toString();
        
        try {
            Creatura.hideIt(dthing);
        } catch (CommandExecException ex) {
            Logger.getLogger(WS3D_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
  
    public static void main(String[] args) {
        WS3D_Controller wS3D_MoverCR = new WS3D_Controller();
    }
}