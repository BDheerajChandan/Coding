import matplotlib.pyplot as plt
import FromExcel
import pandas as pd
import numpy as np
from colorama import Fore
import tkinter
Data_column=[i for i in FromExcel.Full_data()]
while(1):
    print("-"*100)
    s=Fore.RED+"Press 0 for stopping execution"
    print(s)
    print(Fore.WHITE+"Press 1 for plotting fruit Batch ")
    print("Press 2 for plotting fruit Sample")
    print("Press 3 for plotting Hardness on A side")
    print("Press 4 for plotting hardness on B side")
    print("Press 5 for plotting PH on A side - 1st reading")
    print("Press 6 for plotting PH on A side - 2nd reading")
    print("Press 7 for plotting Brix on A side - 1st reading")
    print("Press 8 for plotting Brix on A side - 2nd reading")
    print("Press 9 for plotting Brix on A side - 3rd reading")
    print("Press 10 for plotting Tritable Acidity on A side - 1st reading")
    print("Press 11 for plotting Tritable Acidity on A side - 2nd reading") 
    print("Press 12 for plotting Moisture on B side")
    print("Press 13 for plotting Carotenoids on B side")
    print("Press 14 for plotting Carotenoids_Blank")
    print("Press 15 for printing Remarks")
    print("Press 16 for plotting Acidity on A side")
    print("Press 17 for plotting Brix on A side")
    print("Press 18 for plotting Hardness on A and B side")
    print("Press 19 for printing any two data")

    Plot_Choice=int(input("\nEnter the choice : "))
    #Plot_Choice=1
    if(Plot_Choice==0):
        break
    if(Plot_Choice==1):
        plt.title("BATCH NUMBER")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis BATCH")
        #plt.plot(FromExcel.Batch_Data(),color='r')      # color="red"
        plt.bar(FromExcel.Sample(),FromExcel.Batch_Data(), color ='maroon',width = 0.4)
        print(FromExcel.Batch_Data())
        plt.show()

    elif(Plot_Choice==2):
        plt.title("SAMPLE NUMBER")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis SAMPLE")
        #plt.plot(FromExcel.Sample(),color='g')     #color='green'
        plt.bar(FromExcel.Sample(), FromExcel.Sample(), color ='maroon',width = 0.4)
        print(FromExcel.Sample())
        plt.show()

    elif(Plot_Choice==3):
        plt.title("A SIDE - HARDNESS")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis A_HARDNESS")
        #plt.plot(FromExcel.Hard_A(),color='b')      #color='blue'
        plt.bar(FromExcel.Sample(), FromExcel.Hard_A(), color ='maroon',width = 0.4)
        print(FromExcel.Hard_A())
        plt.show()

    elif(Plot_Choice==4):
        plt.title("B SIDE - HARDNESS")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis B_HARDNESS")
        #plt.plot(FromExcel.Hard_B(),color='c')       #color='cyan'
        plt.bar(FromExcel.Sample(), FromExcel.Hard_B(), color ='maroon',width = 0.4)
        print(FromExcel.Hard_B())
        plt.show()

    elif(Plot_Choice==5):
        plt.title("PH ON A SIDE_1")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis PH_A1")
        #plt.plot(FromExcel.PH_A1(),color='m')          #color='magneta'
        plt.bar(FromExcel.Sample(), FromExcel.PH_A1(), color ='maroon',width = 0.4)
        print(FromExcel.PH_A1())
        plt.show()

    elif(Plot_Choice==6):
        plt.title("PH ON A SIDE_2")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis PH_A2")
        #plt.plot(FromExcel.PH_A2(),color='y')          #color='yellow'
        plt.bar(FromExcel.Sample(), FromExcel.PH_A2(), color ='maroon',width = 0.4)
        print(FromExcel.PH_A2())
        plt.show()

    elif(Plot_Choice==7):
        plt.title("BRIX A SIDE")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis BRIX-A SIDE 1")
        #plt.plot(FromExcel.BRIX_A1(),color='k')   #color='black'
        plt.bar(FromExcel.Sample(), FromExcel.BRIX_A1(), color ='maroon',width = 0.4)
        print(FromExcel.BRIX_A1())
        plt.show()

    elif(Plot_Choice==8):
        plt.title("BRIX B SIDE")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis BRIX-A SIDE 2")
        #plt.plot(FromExcel.BRIX_A2(),color='k')   #color='black'
        plt.bar(FromExcel.Sample(), FromExcel.BRIX_A2(), color ='maroon',width = 0.4)
        print(FromExcel.BRIX_A2())
        plt.show()

    elif(Plot_Choice==9):
        plt.title("BRIX B SIDE")
        plt.xlabel("X-Axis FRUIT ID")
        #plt.ylabel("Y-Axis BRIX-A SIDE 3")9
        plt.bar(FromExcel.Sample(), FromExcel.BRIX_A3(), color ='maroon',width = 0.4)
        #plt.plot(FromExcel.BRIX_A3(),color='k')   #color='black'
        print(FromExcel.BRIX_A3())
        plt.show()

    elif(Plot_Choice==10):
        plt.title("ACIDITY")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis ACIDITY-A SIDE 1")
        #plt.plot(FromExcel.TA_A1(),color='k')   #color='black'
        plt.bar(FromExcel.Sample(), FromExcel.TA_A1(), color ='maroon',width = 0.4)
        print(FromExcel.TA_A1())
        plt.show()

    elif(Plot_Choice==11):
        plt.title("ACIDITY")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis ACIDITY-A SIDE 2")
        #plt.plot(FromExcel.TA_A2(),color='k')   #color='black'
        plt.bar(FromExcel.Sample(), FromExcel.TA_A2(), color ='maroon',width = 0.4)
        print(FromExcel.TA_A2())
        plt.show()

    elif(Plot_Choice==12):
        plt.title("MOISTURE")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis MOISTURE")
        #plt.plot(FromExcel.Moisture_B(),color='k')   #color='black'
        plt.bar(FromExcel.Sample(), FromExcel.Moisture_B(), color ='maroon',width = 0.4)
        print(FromExcel.Moisture_B())
        plt.show()

    elif(Plot_Choice==13):
        plt.title("CAROTENOIDS")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis CAROTENOIDS")
        #plt.plot(FromExcel.Carotenoid_B(),color='k')   #color='black'
        #plt.bar(FromExcel.Sample(), np.asarray(FromExcel.Carotenoid_B(), dtype='float'), color ='maroon',width = 0.4)
        print(FromExcel.Carotenoid_B())
        plt.show()

    elif(Plot_Choice==14):
        plt.title("CAROTENOIDS BLANK")
        plt.xlabel("X-Axis FRUIT ID")
        plt.ylabel("Y-Axis CAROTENOIDS")
        plt.bar(FromExcel.Sample(), FromExcel.Carotenoid_Blank(), color ='maroon',width = 0.4)

    elif(Plot_Choice==15):
        print(FromExcel.Remarks())
        
    elif(Plot_Choice==16):        
        fig,axis=plt.subplots(2,1,figsize=[2,2])
        fig.suptitle("ACIDITY A_1&2")
        SubData=FromExcel.TA()
        axis[0].set_title("ACIDITY SIDE_A1")
        axis[0].set_xlabel("X-Axis FRUIT ID")
        axis[0].set_ylabel("Y-Axis ACIDITY A1")
        axis[0].bar(FromExcel.Sample(), SubData[0], color ='maroon',width = 0.4)
        axis[1].set_title("ACIDITY SIDE_A2")
        axis[1].set_xlabel("X-Axis FRUIT ID")
        axis[1].set_ylabel("Y-Axis ACIDITY A2")
        axis[1].bar(FromExcel.Sample(), SubData[1], color ='maroon',width = 0.4)
        plt.show()

    elif(Plot_Choice==17):        
        fig,axis=plt.subplots(2,2,figsize=[2,2])
        fig.suptitle("BRIX A_1,2&3")
        SubData=FromExcel.BRIX()
        axis[0,0].set_title("BRIX SIDE_A1")
        axis[0,0].set_xlabel("X-Axis FRUIT ID")
        axis[0,0].set_ylabel("Y-Axis BRIX A1")
        axis[0,0].bar(FromExcel.Sample(), SubData[0], color ='red',width = 0.4)
        axis[0,1].set_title("BRIX SIDE_A2")
        axis[0,1].set_xlabel("X-Axis FRUIT ID")
        axis[0,1].set_ylabel("Y-Axis BRIX A2")
        axis[0,1].bar(FromExcel.Sample(), SubData[1], color ='green',width = 0.4)
        axis[1,0].set_title("BRIX SIDE_A3")
        axis[1,0].set_xlabel("X-Axis FRUIT ID")
        axis[1,0].set_ylabel("Y-Axis BRIX A3")
        axis[1,0].bar(FromExcel.Sample(), SubData[2], color ='blue',width = 0.4)

        axis[1,1].plot(FromExcel.Sample(),SubData[0], color ='red',label="Brix A1")
        axis[1,1].plot(FromExcel.Sample(),SubData[1], color ='green',label="Brix A2")
        axis[1,1].plot(FromExcel.Sample(),SubData[2], color ='blue',label="Brix A3")
        axis[1,1].legend()
        plt.show()
    elif(Plot_Choice==18):
        fig,axis=plt.subplots(2,2,figsize=[2,2])
        fig.suptitle("HARDNESS A&B")
        SubData=FromExcel.Hardness()
        axis[0,0].set_title("HARDNESS SIDE_A")
        axis[0,0].set_xlabel("X-Axis FRUIT ID")
        axis[0,0].set_ylabel("Y-Axis HARDNESS A")
        axis[0,0].bar(FromExcel.Sample(), SubData[0], color ='red',width = 0.4)

        axis[0,1].set_title("HARDNESS SIDE_B")
        axis[0,1].set_xlabel("X-Axis FRUIT ID")
        axis[0,1].set_ylabel("Y-Axis HARDNESS B")
        axis[0,1].bar(FromExcel.Sample(), SubData[1], color ='green',width = 0.4)

        axis[1,0].set_title("HARDNESS SIDE_A&B linear")
        axis[1,0].set_xlabel("X-Axis FRUIT ID")
        axis[1,0].set_ylabel("Y-Axis HARDNESS A")
        axis[1,0].plot(FromExcel.Sample(), SubData[0], color ='red')
        axis[1,0].plot(FromExcel.Sample(), SubData[1], color ='green')
        
        axis[1,1].set_title("HARDNESS SIDE_A&B Bar")
        axis[1,1].set_xlabel("X-Axis FRUIT ID")
        axis[1,1].set_ylabel("Y-Axis HARDNESS A")
        axis[1,1].bar(FromExcel.Sample(), SubData[0], color ='red')
        axis[1,1].bar(FromExcel.Sample(), SubData[1], color ='green')
        #plt.plot(SubData[0],'o',color ='red')
        #plt.show(SubData[1],'o',color ='green')
        plt.show()

    elif(Plot_Choice==19):
        Data_choice1=int(input("Enetr choice 1 : "))
        Data_choice2=int(input("Enter chioce 2 : "))
        Data1=FromExcel.df[[Data_column[Data_choice1-1]]]
        Data2=FromExcel.df[Data_column[Data_choice2-1]]
        print(Data1,'\n',Data2)
        #plt.plot(Data1,Data2)

    elif(Plot_Choice=='' or Plot_Choice!=''):
        pass
    else:
        print("Invalid choice")