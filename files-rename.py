import os

# warning: We need add the \\ at the end of path, otherwise the system will not find the files.
path = r"C:\Users\User-Name\AppData\Local\Packages\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\LocalState\Assets\\"
# I created a new folder just to make sure that I will not alter any important file on the windows main directory
#path = r"C:\tmp\file-picture\\"
dir_list = os.listdir(path)

n_list = []
n_conv = []
test_list = []

# This for will generate a range of numbers by using the lenght built-in function of dir_list which has the item on hte folder of systems.
for i in range(dir_list.__len__()):
    n_conv.append(str(i)+'Wall'+".jpg")

# This loop will takes the list with extention of file name which is jpg and
# will put together with the real name of the file in the folder.
for i, j in zip(dir_list, n_conv):
    n_list.append(i+j)

# Use the os function rename to alter the extension of the files to jpg 'picture'.
# Crate a for which use the zip method which allow us to run 2 list at the same time and pass the velue to new variables.

for i, j in zip(dir_list, n_list):
    os.rename(path+i, path+j)
