from tkinter import *
from tkinter import messagebox

# handler function
def key_event(event):
    print(event)
    messagebox.showinfo('키 이벤트', '눌러진 키 : '+str(event.char))


# main
window = Tk()

window.bind('<Key>', key_event)

window.mainloop()