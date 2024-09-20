'''from tkinter import *
root = Tk()		                        # create root window				
frame = Frame(root)			            # frame inside root window	
frame.pack()				            # geometry method		
button = Button(frame, text ='Geek')    # button inside frame which is
button.pack()						    # inside root
root.mainloop()				            # Tkinter event loop	
'''
'''# Import the required libraries
from tkinter import *

# Create an instance of tkinter frame or window
win=Tk()

# Set the size of the tkinter window
#win.geometry("700x300")
frame = Frame(win)			            # frame inside root window	
frame.pack()

# Define a function to delete the shape
def on_click():
   print (win.winfo_children())

# Create a canvas widget
canvas=Canvas(win, width=500, height=300)
canvas.pack()

# Create a button to delete the button
Button(win, text="Click", command=on_click).pack()

win.mainloop()'''

# !/usr/bin/python3  
  
'''from tkinter import *    
top = Tk()    
top.geometry("400x250")  
#def display(a1,a2):
#def on_click(a,b):
#   print (top.winfo_children())
#creating label  
uname = Label(top, text = "Username").place(x = 30,y = 50)    
password = Label(top, text = "Password").place(x = 30, y = 90)   
  
# Text Field
e1 = Entry(top,text = "Username",width = 20).place(x = 100, y = 50)  
e2 = Entry(top,text = "pwd", width = 20).place(x = 100, y = 90) 
sbmitbtn = Button(top, text = "Submit",activebackground = "pink", activeforeground = "blue").place(x = 30, y = 120) 
#Button(top, text="Click", command=on_click)
e3 = Text(top,text = e2, width = 20).place(x = 100, y = 150)
#print(e1,'\n',e2)
top.mainloop()'''


'''from tkinter import *
from tkinter.ttk import *
import ipywidgets as widgets
def process_name():
    global name_entry , out
    print("Hi {}".format(name_entry.get()))   # Output on terminal.
    #out=name_entry.get()                      # To read data         
    #print('Output : ',out)
    global nameLabel 
    nameLabel.configure(text=f'Hi {name_entry.get()}')          # Output display text

def main():
    global name_entry, nameLabel, nameLabel2,label
    window = Tk()                                                 # window
    window.geometry("600x250")                                    # window size
    
    name_label = Label(window, text='Enter name a name below:')   # Addding a label text
    name_label.grid(row=0, column=0)                              # label position in window
    
    name_entry = Entry(window)                                    # Input text for added label with label text
    name_entry.grid(row=1, column=0)                              # label position in window
    
    button = Button(window, text='Say hello', command=process_name, padding=10)
    button.grid(row=1, column=2, columnspan=1)    # I defined a label BELOW the button to show how to change
    
    nameLabel2 = Label(window, text='Entered name : ')
    nameLabel2.grid(row=1,column=3)

    nameLabel = Label(window, text='')
    nameLabel.grid(row=1,column=4)

    photo="C:\\Users\\dheeraj\\Downloads\\1690781120676.jpg"
    label = Tk.Label(window, image=photo)
    label.grid(row=4,column=4)
    window.mainloop()
main()'''


'''from tkinter import *
from tkinter.ttk import *'''
import ipywidgets as widgets
from IPython.display import display
w = widgets.IntSlider()
display(w)
#widgets.IntSlider()