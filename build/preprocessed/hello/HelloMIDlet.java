/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import InnerActiveSDK.IASDK;
import java.util.Date;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.rms.*;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.wma.SMSComposer;

/**
 * @author Bharath
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command exitCommand1;
    private Command okCommand;
    private Command okCommand1;
    private Command exitCommand2;
    private Command backCommand;
    private Command backCommand1;
    private Command backCommand2;
    private Command exitCommand3;
    private Command backCommand3;
    private Command okCommand2;
    private Command backCommand4;
    private Command backCommand5;
    private Command exitCommand5;
    private Command exitCommand4;
    private Command exitCommand6;
    private Command backCommand6;
    private Command exitCommand7;
    private Command okCommand3;
    private Command okCommand4;
    private Command backCommand8;
    private Command exitCommand8;
    private Command backCommand7;
    private Command backCommand9;
    private Command exitCommand9;
    private Command okCommand5;
    private Command okCommand6;
    private Command backCommand10;
    private Command exitCommand10;
    private Command okCommand7;
    private Command okCommand8;
    private Command okCommand9;
    private Command backCommand11;
    private Command exitCommand11;
    private Command okCommand10;
    private Command exitCommand12;
    private Command backCommand12;
    private Command okCommand11;
    private Command backCommand13;
    private Command exitCommand13;
    private SplashScreen splashScreen;
    private List list;
    private List list2;
    private List list1;
    private Form form;
    private TextField textField;
    private ChoiceGroup choiceGroup;
    private TextField textField2;
    private TextField textField1;
    private SMSComposer smsComposer;
    private Form form1;
    private TextField textField3;
    private List list3;
    private SMSComposer smsComposer1;
    private List list4;
    private Form form2;
    private TextField textField4;
    private TextField textField7;
    private ChoiceGroup choiceGroup1;
    private TextField textField6;
    private TextField textField5;
    private TextField textField8;
    private Form form3;
    private TextField textField11;
    private TextField textField10;
    private DateField dateField;
    private TextField textField9;
    private List list5;
    private Form form4;
    private TextField textField12;
    private TextField textField13;
    private TextField textField14;
    private TextField textField15;
    private List list6;
    private Form form5;
    private TextField textField16;
    private TextField textField17;
    private DateField dateField1;
    private List list7;
//</editor-fold>//GEN-END:|fields|0|
    private String Towncode;
    private String message;
    private String Phoneno;
    private String bmrvalue;
    private RecordStore rs;
    private RecordEnumeration reenum;
    private String newRec;
    private RecordStore recordStore;
    
    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
      
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
   
// call IASDK.start() with (application’s midlet)
int retCode = 0;
        try {
            retCode = IASDK.start(this);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
if (retCode != 0)
{

}
 try {
               IASDK.displayAd();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then
     * <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|57-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|57-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|2|57-postAction
                // write post-action user code here
            } else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|3|59-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|59-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|5|55-preAction
                String bookno=textField2.getString();
                String show=choiceGroup.getString(choiceGroup.getSelectedIndex());
                String showcode="";
                if(show=="First"){
                    showcode="FS";
                }
                else if(show=="Second"){
                    showcode="SS";
                    
                }
                else if(show=="Noon"){
                    showcode="NS";
                }
                else if(show=="Matinee"){
                    showcode="MT";
                }
                else
                {
                    Alert alert=new Alert("Show??","Pls select show to proceed further!",null,AlertType.ERROR);
                    alert.setTimeout(Alert.FOREVER);
                    
                }
                String datevalue=textField.getString();
                String theatre=textField1.getString();
                int dateint=Integer.parseInt(datevalue);
                int bookint=Integer.parseInt(bookno);
                if(dateint<=31 && bookint<5){
                    message="book"+bookno+" "+Towncode.toLowerCase().toString()+theatre+" "+showcode+" "+datevalue;
                    Phoneno="52627";
                }
                else
                {
                    Alert alert=new Alert("Wrong Value","Pls enter correct values!!",null,AlertType.WARNING);
                    alert.setTimeout(Alert.FOREVER);
                }
                switchDisplayable(null, getSmsComposer());//GEN-LINE:|7-commandAction|6|55-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|87-preAction
        } else if (displayable == form1) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|7|87-preAction
                // write pre-action user code here
                switchDisplayable(null, getList3());//GEN-LINE:|7-commandAction|8|87-postAction
                // write post-action user code here
            } else if (command == exitCommand3) {//GEN-LINE:|7-commandAction|9|85-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|10|85-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|11|83-preAction
                // write pre-action user code here
                switchDisplayable(null, getSmsComposer1());//GEN-LINE:|7-commandAction|12|83-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|129-preAction
        } else if (displayable == form2) {
            if (command == backCommand7) {//GEN-END:|7-commandAction|13|129-preAction
                // write pre-action user code here
                switchDisplayable(null, getList4());//GEN-LINE:|7-commandAction|14|129-postAction
                // write post-action user code here
            } else if (command == exitCommand7) {//GEN-LINE:|7-commandAction|15|127-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|16|127-postAction
                // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|17|125-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|18|125-postAction
                // write post-action user code here
                String choice=choiceGroup1.getString(choiceGroup1.getSelectedIndex());
                int Weight=Integer.parseInt(textField4.getString());
                int Height=Integer.parseInt(textField5.getString());
                int Age=Integer.parseInt(textField6.getString());
                if(choice.equals( "Man")){
                  double bmr=66 + (6.23 * Weight) + (12.7 * Height) - (6.8 * Age);
                 
                 double time=1000/(Integer.parseInt(textField7.getString()) * 60);
                 if(time > 1){
                     bmr=bmr+(time * 37.5);
                 }
                 bmrvalue=String.valueOf(bmr);
                 textField8.setString(bmrvalue);
                }
                else if(choice.equals("Woman")){
                 double BMR=(655 + (4.35 * Weight) + (4.7 * Height) - (4.7 * Age));
                 double time=1000/(Integer.parseInt(textField7.getString()) * 60);
                 if(time > 1){
                     BMR=BMR+(time * 37.5);
                 }
                 bmrvalue=String.valueOf(BMR);
                 textField8.setString(bmrvalue);
                }
                else{
                    //Alert alert=new Alert("");
                }
            }//GEN-BEGIN:|7-commandAction|19|142-preAction
        } else if (displayable == form3) {
            if (command == backCommand8) {//GEN-END:|7-commandAction|19|142-preAction
                // write pre-action user code here
                switchDisplayable(null, getList4());//GEN-LINE:|7-commandAction|20|142-postAction
                // write post-action user code here
            } else if (command == exitCommand8) {//GEN-LINE:|7-commandAction|21|144-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|22|144-postAction
                // write post-action user code here
            } else if (command == okCommand4) {//GEN-LINE:|7-commandAction|23|140-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|24|140-postAction
                String doctorname="Doct"+textField9.getString();
                String hosname="Hosn"+textField10.getString();
                String address="Addr"+textField11.getString();
                String date="Date"+dateField.getDate().toString();
                try {
            rs=RecordStore.openRecordStore("Health", true);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        } 
                try{
                    byte[] doct=doctorname.getBytes();
                    byte[] hos=hosname.getBytes();
                    byte[] addr=address.getBytes();
                    byte[] dat=date.getBytes();
                    rs.addRecord(doct, 0, doct.length);
                    rs.addRecord(dat, 0, dat.length);
                    rs.addRecord(hos, 0,hos.length);
                    rs.addRecord(addr, 0, addr.length);
                              
                   
                    Alert alert=new Alert("Confirmed","Added to your appointments!Get well soon!",null,AlertType.INFO);
                    alert.setTimeout(Alert.FOREVER);
                    switchDisplayable(alert,form3);
                }
                catch(Exception e){
                    
                }
            } else if (command == okCommand6) {//GEN-LINE:|7-commandAction|25|162-preAction
                // write pre-action user code here
                switchDisplayable(null, getList5());//GEN-LINE:|7-commandAction|26|162-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|27|169-preAction
        } else if (displayable == form4) {
            if (command == backCommand10) {//GEN-END:|7-commandAction|27|169-preAction
                // write pre-action user code here
                switchDisplayable(null, getList4());//GEN-LINE:|7-commandAction|28|169-postAction
                // write post-action user code here
            } else if (command == exitCommand10) {//GEN-LINE:|7-commandAction|29|171-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|30|171-postAction
                // write post-action user code here
            } else if (command == okCommand8) {//GEN-LINE:|7-commandAction|31|181-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|32|181-postAction
                String medicinename="Medn" +textField12.getString();
                String morning="Morn"+textField13.getString();
                String noon="Noon"+textField14.getString();
                String night="Nite"+textField15.getString();
                try {
            rs=RecordStore.openRecordStore("Health", true);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        } 
                try{
                    byte[] medic=medicinename.getBytes();
                    byte[] morn=morning.getBytes();
                    byte[] Noon1=noon.getBytes();
                    byte[] night1=night.getBytes();
                    rs.addRecord(medic, 0, medic.length);
                    rs.addRecord(morn, 0, morn.length);
                    rs.addRecord(Noon1,0,Noon1.length);
                    rs.addRecord(night1, 0, night1.length);
                    
                    
                    
                    Alert alert=new Alert("Confirmed","Added to your medic store!Get well soon!",null,AlertType.INFO);
                    alert.setTimeout(Alert.FOREVER);
                    switchDisplayable(alert,form4);
                }
                catch(Exception e){
                    
                }
            } else if (command == okCommand9) {//GEN-LINE:|7-commandAction|33|183-preAction
                // write pre-action user code here
                switchDisplayable(null, getList6());//GEN-LINE:|7-commandAction|34|183-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|35|204-preAction
        } else if (displayable == form5) {
            if (command == backCommand12) {//GEN-END:|7-commandAction|35|204-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|36|204-postAction
                // write post-action user code here
            } else if (command == exitCommand12) {//GEN-LINE:|7-commandAction|37|202-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|38|202-postAction
                // write post-action user code here
            } else if (command == okCommand10) {//GEN-LINE:|7-commandAction|39|200-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|40|200-postAction
                try {
                    recordStore=RecordStore.openRecordStore("Task",true);
                } catch (RecordStoreException ex) {
                } 
                try{
                
                
                Date datetime=dateField1.getDate();
                String datestring="Date"+datetime.toString();
                byte[] datevalue=datestring.getBytes();
                recordStore.addRecord(datevalue,0,datevalue.length);
                String TaskName="Task"+textField16.getString();
                byte[] name=TaskName.getBytes();
                recordStore.addRecord(name,0, name.length);
                String TaskDescription="Desc"+textField17.getString();
                byte[] desc=TaskDescription.getBytes();
                recordStore.addRecord(desc, 0, desc.length);
                Alert alert=new Alert("Confirmed","Added to your Tasks List !",null,AlertType.INFO);
                    alert.setTimeout(Alert.FOREVER);
                    switchDisplayable(alert,form5);
                }
                catch(Exception e){
                    
                }
            } else if (command == okCommand11) {//GEN-LINE:|7-commandAction|41|206-preAction
                // write pre-action user code here
                switchDisplayable(null, getList7());//GEN-LINE:|7-commandAction|42|206-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|43|28-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|43|28-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|44|28-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|45|41-preAction
        } else if (displayable == list1) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|45|41-preAction
                // write pre-action user code here
                list1Action();//GEN-LINE:|7-commandAction|46|41-postAction
                // write post-action user code here
            } else if (command == backCommand1) {//GEN-LINE:|7-commandAction|47|64-preAction
                // write pre-action user code here
                switchDisplayable(null, getList2());//GEN-LINE:|7-commandAction|48|64-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|49|47-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|50|47-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|51|45-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|52|45-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|53|35-preAction
        } else if (displayable == list2) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|53|35-preAction
                // write pre-action user code here
                list2Action();//GEN-LINE:|7-commandAction|54|35-postAction
                // write post-action user code here
            } else if (command == backCommand2) {//GEN-LINE:|7-commandAction|55|67-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|56|67-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|57|74-preAction
        } else if (displayable == list3) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|57|74-preAction
                // write pre-action user code here
                list3Action();//GEN-LINE:|7-commandAction|58|74-postAction
                // write post-action user code here
            } else if (command == backCommand6) {//GEN-LINE:|7-commandAction|59|106-preAction
                // write pre-action user code here
                switchDisplayable(null, getList2());//GEN-LINE:|7-commandAction|60|106-postAction
                // write post-action user code here
            } else if (command == exitCommand6) {//GEN-LINE:|7-commandAction|61|108-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|62|108-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|63|112-preAction
        } else if (displayable == list4) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|63|112-preAction
                // write pre-action user code here
                list4Action();//GEN-LINE:|7-commandAction|64|112-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|65|152-preAction
        } else if (displayable == list5) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|65|152-preAction
                // write pre-action user code here
                list5Action();//GEN-LINE:|7-commandAction|66|152-postAction
                // write post-action user code here
            } else if (command == backCommand9) {//GEN-LINE:|7-commandAction|67|156-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|68|156-postAction
                // write post-action user code here
            } else if (command == exitCommand9) {//GEN-LINE:|7-commandAction|69|158-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|70|158-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|71|185-preAction
        } else if (displayable == list6) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|71|185-preAction
                // write pre-action user code here
                list6Action();//GEN-LINE:|7-commandAction|72|185-postAction
                // write post-action user code here
            } else if (command == backCommand11) {//GEN-LINE:|7-commandAction|73|189-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|7-commandAction|74|189-postAction
                // write post-action user code here
            } else if (command == exitCommand11) {//GEN-LINE:|7-commandAction|75|191-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|76|191-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|77|208-preAction
        } else if (displayable == list7) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|77|208-preAction
                // write pre-action user code here
                list7Action();//GEN-LINE:|7-commandAction|78|208-postAction
                // write post-action user code here
            } else if (command == backCommand13) {//GEN-LINE:|7-commandAction|79|212-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm5());//GEN-LINE:|7-commandAction|80|212-postAction
                // write post-action user code here
            } else if (command == exitCommand13) {//GEN-LINE:|7-commandAction|81|214-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|82|214-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|83|71-preAction
        } else if (displayable == smsComposer) {
            if (command == SMSComposer.SEND_COMMAND) {//GEN-END:|7-commandAction|83|71-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|84|71-postAction
                // write post-action user code here
            } else if (command == backCommand5) {//GEN-LINE:|7-commandAction|85|102-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|86|102-postAction
                // write post-action user code here
            } else if (command == exitCommand5) {//GEN-LINE:|7-commandAction|87|100-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|88|100-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|89|91-preAction
        } else if (displayable == smsComposer1) {
            if (command == SMSComposer.SEND_COMMAND) {//GEN-END:|7-commandAction|89|91-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|90|91-postAction
                // write post-action user code here
            } else if (command == backCommand4) {//GEN-LINE:|7-commandAction|91|94-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|92|94-postAction
                // write post-action user code here
            } else if (command == exitCommand4) {//GEN-LINE:|7-commandAction|93|97-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|94|97-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|95|24-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|95|24-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|96|24-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|97|7-postCommandAction
        }//GEN-END:|7-commandAction|97|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|98|
//</editor-fold>//GEN-END:|7-commandAction|98|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initialized instance of splashScreen component.
     *
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|22-getter|0|22-preInit
           
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|22-getter|1|22-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of list component.
     *
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            list = new List("Choose your Helper", Choice.IMPLICIT);//GEN-BEGIN:|26-getter|1|26-postInit
            list.append("Book Your Show", null);
            list.append("Health Meter", null);
            list.append("Task Manager", null);
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return list;
    }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|26-action|0|26-preAction
    /**
     * Performs an action assigned to the selected list element in the list
     * component.
     */
    public void listAction() {//GEN-END:|26-action|0|26-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|26-action|1|31-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Book Your Show")) {//GEN-END:|26-action|1|31-preAction
                // write pre-action user code here
                switchDisplayable(null, getList2());//GEN-LINE:|26-action|2|31-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Health Meter")) {//GEN-LINE:|26-action|3|32-preAction
                // write pre-action user code here
                switchDisplayable(null, getList4());//GEN-LINE:|26-action|4|32-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Task Manager")) {//GEN-LINE:|26-action|5|33-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm5());//GEN-LINE:|26-action|6|33-postAction
                // write post-action user code here
            }//GEN-BEGIN:|26-action|7|26-postAction
        }//GEN-END:|26-action|7|26-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|26-action|8|
//</editor-fold>//GEN-END:|26-action|8|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list2 ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initialized instance of list2 component.
     *
     * @return the initialized component instance
     */
    public List getList2() {
        if (list2 == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            list2 = new List("Book Your Show", Choice.IMPLICIT);//GEN-BEGIN:|34-getter|1|34-postInit
            list2.append("SMS Balcony", null);
            list2.append("PVR Cinemas", null);
            list2.addCommand(getBackCommand2());
            list2.setCommandListener(this);
            list2.setSelectedFlags(new boolean[]{false, false});//GEN-END:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return list2;
    }
//</editor-fold>//GEN-END:|34-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list2Action ">//GEN-BEGIN:|34-action|0|34-preAction
    /**
     * Performs an action assigned to the selected list element in the list2
     * component.
     */
    public void list2Action() {//GEN-END:|34-action|0|34-preAction
        // enter pre-action user code here
        String __selectedString = getList2().getString(getList2().getSelectedIndex());//GEN-BEGIN:|34-action|1|37-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("SMS Balcony")) {//GEN-END:|34-action|1|37-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|34-action|2|37-postAction
                // write post-action user code here
            } else if (__selectedString.equals("PVR Cinemas")) {//GEN-LINE:|34-action|3|38-preAction
                // write pre-action user code here
                switchDisplayable(null, getList3());//GEN-LINE:|34-action|4|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|34-action|5|34-postAction
        }//GEN-END:|34-action|5|34-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|34-action|6|
//</editor-fold>//GEN-END:|34-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list1 ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of list1 component.
     *
     * @return the initialized component instance
     */
    public List getList1() {
        if (list1 == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            list1 = new List("SMS Balcony", Choice.IMPLICIT);//GEN-BEGIN:|40-getter|1|40-postInit
            list1.addCommand(getOkCommand());
            list1.addCommand(getExitCommand1());
            list1.addCommand(getBackCommand1());
            list1.setCommandListener(this);//GEN-END:|40-getter|1|40-postInit

            list1.append("Kanhangad           KJD", null);
            list1.append("Kannur              KNR", null);
            list1.append("Karunagapally       KNP", null);
            list1.append("Kazhakootam         KZM", null);
            list1.append("Kollam              KLM", null);
            list1.append("Kottayam            KTM", null);
            list1.append("Kozhikode           KKD", null);
            list1.append("Kunnamkulam         KNM", null);
            list1.append("Mananthavadi        MVI", null);
            list1.append("Mavelikkara         MVK", null);
            list1.append("Palakkad            PKD", null);
            list1.append("Perinthalmanna      PMN", null);
            list1.append("Punalur             PLR", null);
            list1.append("Thalayolaparampu    TPB", null);
            list1.append("Thrissur            TSR", null);
            list1.append("Trivandrum          TVM", null);
            list1.append("Vadanapally         VDN", null);
            list1.append("Alappuzha           ALP", null);
            list1.append("Angadipuram         ADP", null);
            list1.append("Attingal            ATL", null);
            list1.append("Changanacherry      CHY", null);
            list1.append("Ernakulam           EKM", null);
            list1.append("Irinjalakkuda       IJK", null);
        }//GEN-BEGIN:|40-getter|2|
        return list1;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list1Action ">//GEN-BEGIN:|40-action|0|40-preAction
    /**
     * Performs an action assigned to the selected list element in the list1
     * component.
     */
    public void list1Action() {//GEN-END:|40-action|0|40-preAction
        // enter pre-action user code here
        String __selectedString = getList1().getString(getList1().getSelectedIndex());//GEN-LINE:|40-action|1|40-postAction
        
        Towncode=__selectedString.substring(__selectedString.length()-3);
    }//GEN-BEGIN:|40-action|2|
//</editor-fold>//GEN-END:|40-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            okCommand = new Command("Next", Command.OK, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|44-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            form = new Form("Details", new Item[]{getChoiceGroup(), getTextField(), getTextField1(), getTextField2()});//GEN-BEGIN:|48-getter|1|48-postInit
            form.addCommand(getOkCommand1());
            form.addCommand(getBackCommand());
            form.addCommand(getExitCommand2());
            form.setCommandListener(this);//GEN-END:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|48-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Show", Choice.EXCLUSIVE);//GEN-LINE:|50-getter|1|50-postInit
            choiceGroup.append("First", null);
            choiceGroup.append("Second", null);
            choiceGroup.append("Noon", null);
            choiceGroup.append("Matinee", null);
        }//GEN-BEGIN:|50-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            textField = new TextField("Date", "", 32, TextField.ANY);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            textField1 = new TextField("Theatre Name", "", 32, TextField.ANY);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|52-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initialized instance of textField2 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            textField2 = new TextField("Total Tickets ( Max 4)", "", 32, TextField.NUMERIC);//GEN-LINE:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return textField2;
    }
//</editor-fold>//GEN-END:|53-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|54-getter|1|54-postInit
            // write post-init user code here
        }//GEN-BEGIN:|54-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|54-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|56-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initialized instance of exitCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return exitCommand2;
    }
//</editor-fold>//GEN-END:|58-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initialized instance of backCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return backCommand1;
    }
//</editor-fold>//GEN-END:|63-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initialized instance of backCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|66-getter|1|66-postInit
            // write post-init user code here
        }//GEN-BEGIN:|66-getter|2|
        return backCommand2;
    }
//</editor-fold>//GEN-END:|66-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: smsComposer ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initialized instance of smsComposer component.
     *
     * @return the initialized component instance
     */
    public SMSComposer getSmsComposer() {
        if (smsComposer == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            smsComposer = new SMSComposer(getDisplay());//GEN-BEGIN:|69-getter|1|69-postInit
            smsComposer.setTitle("smsComposer");
            smsComposer.addCommand(SMSComposer.SEND_COMMAND);
            smsComposer.addCommand(getExitCommand5());
            smsComposer.addCommand(getBackCommand5());
            smsComposer.setCommandListener(this);
            smsComposer.setBGColor(-3355444);
            smsComposer.setFGColor(-16777216);
            smsComposer.setPhoneNumberLabel("Phone Number Label");
            smsComposer.setMessageLabel("Message Label");//GEN-END:|69-getter|1|69-postInit
            smsComposer.setPhoneNumber(Phoneno);
            smsComposer.setMessage(message);
        }//GEN-BEGIN:|69-getter|2|
        return smsComposer;
    }
//</editor-fold>//GEN-END:|69-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list3 ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initialized instance of list3 component.
     *
     * @return the initialized component instance
     */
    public List getList3() {
        if (list3 == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            list3 = new List("PVR Cinemas", Choice.IMPLICIT);//GEN-BEGIN:|73-getter|1|73-postInit
            list3.append("Interactive Voice Response", null);
            list3.append("SMS Booking", null);
            list3.addCommand(getBackCommand6());
            list3.addCommand(getExitCommand6());
            list3.setCommandListener(this);
            list3.setSelectedFlags(new boolean[]{false, false});//GEN-END:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return list3;
    }
//</editor-fold>//GEN-END:|73-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list3Action ">//GEN-BEGIN:|73-action|0|73-preAction
    /**
     * Performs an action assigned to the selected list element in the list3
     * component.
     */
    public void list3Action() {//GEN-END:|73-action|0|73-preAction
        // enter pre-action user code here
        String __selectedString = getList3().getString(getList3().getSelectedIndex());//GEN-BEGIN:|73-action|1|77-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Interactive Voice Response")) {//GEN-END:|73-action|1|77-preAction
                // write pre-action user code here
//GEN-LINE:|73-action|2|77-postAction
                // write post-action user code here
                try{
                if(this.platformRequest("tel:08800900009")){
                 try {
                pauseApp();
                notifyPaused();
            } catch (Exception e) {
                //Nothing to do..
            }
            }
                }
                catch(Exception e){
                    
                }
            } else if (__selectedString.equals("SMS Booking")) {//GEN-LINE:|73-action|3|78-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|73-action|4|78-postAction
                // write post-action user code here
            }//GEN-BEGIN:|73-action|5|73-postAction
        }//GEN-END:|73-action|5|73-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|73-action|6|
//</editor-fold>//GEN-END:|73-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|82-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initialized instance of exitCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand3() {
        if (exitCommand3 == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            exitCommand3 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return exitCommand3;
    }
//</editor-fold>//GEN-END:|84-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initialized instance of backCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            backCommand3 = new Command("Back", Command.BACK, 0);//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return backCommand3;
    }
//</editor-fold>//GEN-END:|86-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initialized instance of form1 component.
     *
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            form1 = new Form("PVR Movies", new Item[]{getTextField3()});//GEN-BEGIN:|79-getter|1|79-postInit
            form1.addCommand(getOkCommand2());
            form1.addCommand(getExitCommand3());
            form1.addCommand(getBackCommand3());
            form1.setCommandListener(this);//GEN-END:|79-getter|1|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|2|
        return form1;
    }
//</editor-fold>//GEN-END:|79-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|81-getter|0|81-preInit
    /**
     * Returns an initialized instance of textField3 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|81-getter|0|81-preInit
            // write pre-init user code here
            textField3 = new TextField("Movie Name", "", 32, TextField.ANY);//GEN-LINE:|81-getter|1|81-postInit
            // write post-init user code here
        }//GEN-BEGIN:|81-getter|2|
        return textField3;
    }
//</editor-fold>//GEN-END:|81-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: smsComposer1 ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initialized instance of smsComposer1 component.
     *
     * @return the initialized component instance
     */
    public SMSComposer getSmsComposer1() {
        if (smsComposer1 == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            smsComposer1 = new SMSComposer(getDisplay());//GEN-BEGIN:|90-getter|1|90-postInit
            smsComposer1.setTitle("Confirm SMS");
            smsComposer1.addCommand(SMSComposer.SEND_COMMAND);
            smsComposer1.addCommand(getBackCommand4());
            smsComposer1.addCommand(getExitCommand4());
            smsComposer1.setCommandListener(this);
            smsComposer1.setBGColor(-3355444);
            smsComposer1.setFGColor(-16777216);
            smsComposer1.setPhoneNumberLabel("Phone Number Label");
            smsComposer1.setMessageLabel("Message Label");//GEN-END:|90-getter|1|90-postInit
            smsComposer1.setMessage("Movie"+" "+textField3.getString());
            smsComposer1.setPhoneNumber("53030");
        }//GEN-BEGIN:|90-getter|2|
        return smsComposer1;
    }
//</editor-fold>//GEN-END:|90-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initialized instance of backCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            backCommand4 = new Command("Back", Command.BACK, 0);//GEN-LINE:|93-getter|1|93-postInit
            // write post-init user code here
        }//GEN-BEGIN:|93-getter|2|
        return backCommand4;
    }
//</editor-fold>//GEN-END:|93-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand4 ">//GEN-BEGIN:|96-getter|0|96-preInit
    /**
     * Returns an initialized instance of exitCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand4() {
        if (exitCommand4 == null) {//GEN-END:|96-getter|0|96-preInit
            // write pre-init user code here
            exitCommand4 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|96-getter|1|96-postInit
            // write post-init user code here
        }//GEN-BEGIN:|96-getter|2|
        return exitCommand4;
    }
//</editor-fold>//GEN-END:|96-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand5 ">//GEN-BEGIN:|99-getter|0|99-preInit
    /**
     * Returns an initialized instance of exitCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand5() {
        if (exitCommand5 == null) {//GEN-END:|99-getter|0|99-preInit
            // write pre-init user code here
            exitCommand5 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|99-getter|1|99-postInit
            // write post-init user code here
        }//GEN-BEGIN:|99-getter|2|
        return exitCommand5;
    }
//</editor-fold>//GEN-END:|99-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand5 ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initialized instance of backCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand5() {
        if (backCommand5 == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            backCommand5 = new Command("Back", Command.BACK, 0);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return backCommand5;
    }
//</editor-fold>//GEN-END:|101-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand6 ">//GEN-BEGIN:|105-getter|0|105-preInit
    /**
     * Returns an initialized instance of backCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand6() {
        if (backCommand6 == null) {//GEN-END:|105-getter|0|105-preInit
            // write pre-init user code here
            backCommand6 = new Command("Back", Command.BACK, 0);//GEN-LINE:|105-getter|1|105-postInit
            // write post-init user code here
        }//GEN-BEGIN:|105-getter|2|
        return backCommand6;
    }
//</editor-fold>//GEN-END:|105-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand6 ">//GEN-BEGIN:|107-getter|0|107-preInit
    /**
     * Returns an initialized instance of exitCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand6() {
        if (exitCommand6 == null) {//GEN-END:|107-getter|0|107-preInit
            // write pre-init user code here
            exitCommand6 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|107-getter|1|107-postInit
            // write post-init user code here
        }//GEN-BEGIN:|107-getter|2|
        return exitCommand6;
    }
//</editor-fold>//GEN-END:|107-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list4 ">//GEN-BEGIN:|111-getter|0|111-preInit
    /**
     * Returns an initialized instance of list4 component.
     *
     * @return the initialized component instance
     */
    public List getList4() {
        if (list4 == null) {//GEN-END:|111-getter|0|111-preInit
            // write pre-init user code here
            list4 = new List("Choose your Helper", Choice.IMPLICIT);//GEN-BEGIN:|111-getter|1|111-postInit
            list4.append("Jogging Meter", null);
            list4.append("Doctor Appointments", null);
            list4.append("Medics", null);
            list4.setCommandListener(this);
            list4.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|111-getter|1|111-postInit
            // write post-init user code here
        }//GEN-BEGIN:|111-getter|2|
        return list4;
    }
//</editor-fold>//GEN-END:|111-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list4Action ">//GEN-BEGIN:|111-action|0|111-preAction
    /**
     * Performs an action assigned to the selected list element in the list4
     * component.
     */
    public void list4Action() {//GEN-END:|111-action|0|111-preAction
        // enter pre-action user code here
        String __selectedString = getList4().getString(getList4().getSelectedIndex());//GEN-BEGIN:|111-action|1|115-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Jogging Meter")) {//GEN-END:|111-action|1|115-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|111-action|2|115-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Doctor Appointments")) {//GEN-LINE:|111-action|3|116-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|111-action|4|116-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Medics")) {//GEN-LINE:|111-action|5|165-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|111-action|6|165-postAction
                // write post-action user code here
            }//GEN-BEGIN:|111-action|7|111-postAction
        }//GEN-END:|111-action|7|111-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|111-action|8|
//</editor-fold>//GEN-END:|111-action|8|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|124-getter|0|124-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|124-getter|0|124-preInit
            // write pre-init user code here
            okCommand3 = new Command("Calculate", Command.OK, 0);//GEN-LINE:|124-getter|1|124-postInit
            // write post-init user code here
        }//GEN-BEGIN:|124-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|124-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand7 ">//GEN-BEGIN:|126-getter|0|126-preInit
    /**
     * Returns an initialized instance of exitCommand7 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand7() {
        if (exitCommand7 == null) {//GEN-END:|126-getter|0|126-preInit
            // write pre-init user code here
            exitCommand7 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|126-getter|1|126-postInit
            // write post-init user code here
        }//GEN-BEGIN:|126-getter|2|
        return exitCommand7;
    }
//</editor-fold>//GEN-END:|126-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand7 ">//GEN-BEGIN:|128-getter|0|128-preInit
    /**
     * Returns an initialized instance of backCommand7 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand7() {
        if (backCommand7 == null) {//GEN-END:|128-getter|0|128-preInit
            // write pre-init user code here
            backCommand7 = new Command("Back", Command.BACK, 0);//GEN-LINE:|128-getter|1|128-postInit
            // write post-init user code here
        }//GEN-BEGIN:|128-getter|2|
        return backCommand7;
    }
//</editor-fold>//GEN-END:|128-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|117-getter|0|117-preInit
    /**
     * Returns an initialized instance of form2 component.
     *
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {//GEN-END:|117-getter|0|117-preInit
            // write pre-init user code here
            form2 = new Form("Jogging Meter", new Item[]{getTextField4(), getTextField5(), getTextField6(), getChoiceGroup1(), getTextField7(), getTextField8()});//GEN-BEGIN:|117-getter|1|117-postInit
            form2.addCommand(getOkCommand3());
            form2.addCommand(getExitCommand7());
            form2.addCommand(getBackCommand7());
            form2.setCommandListener(this);//GEN-END:|117-getter|1|117-postInit
            // write post-init user code here
        }//GEN-BEGIN:|117-getter|2|
        return form2;
    }
//</editor-fold>//GEN-END:|117-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|119-getter|0|119-preInit
    /**
     * Returns an initialized instance of textField4 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
            textField4 = new TextField("Weight", "", 32, TextField.NUMERIC);//GEN-LINE:|119-getter|1|119-postInit
            // write post-init user code here
        }//GEN-BEGIN:|119-getter|2|
        return textField4;
    }
//</editor-fold>//GEN-END:|119-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|120-getter|0|120-preInit
    /**
     * Returns an initialized instance of textField5 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|120-getter|0|120-preInit
            // write pre-init user code here
            textField5 = new TextField("Height", "", 32, TextField.NUMERIC);//GEN-LINE:|120-getter|1|120-postInit
            // write post-init user code here
        }//GEN-BEGIN:|120-getter|2|
        return textField5;
    }
//</editor-fold>//GEN-END:|120-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|121-getter|0|121-preInit
    /**
     * Returns an initialized instance of textField6 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|121-getter|0|121-preInit
            // write pre-init user code here
            textField6 = new TextField("Age", "", 32, TextField.NUMERIC);//GEN-LINE:|121-getter|1|121-postInit
            // write post-init user code here
        }//GEN-BEGIN:|121-getter|2|
        return textField6;
    }
//</editor-fold>//GEN-END:|121-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|122-getter|0|122-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|122-getter|0|122-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("Gender", Choice.EXCLUSIVE);//GEN-BEGIN:|122-getter|1|122-postInit
            choiceGroup1.append("Man", null);
            choiceGroup1.append("Woman", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false});//GEN-END:|122-getter|1|122-postInit
            // write post-init user code here
        }//GEN-BEGIN:|122-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|122-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|123-getter|0|123-preInit
    /**
     * Returns an initialized instance of textField7 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|123-getter|0|123-preInit
            // write pre-init user code here
            textField7 = new TextField("Minutes you Jogged", "", 32, TextField.NUMERIC);//GEN-LINE:|123-getter|1|123-postInit
            // write post-init user code here
        }//GEN-BEGIN:|123-getter|2|
        return textField7;
    }
//</editor-fold>//GEN-END:|123-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|132-getter|0|132-preInit
    /**
     * Returns an initialized instance of textField8 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField8() {
        if (textField8 == null) {//GEN-END:|132-getter|0|132-preInit
            // write pre-init user code here
            textField8 = new TextField("Calories Burned", "", 32, TextField.ANY);//GEN-LINE:|132-getter|1|132-postInit
            // write post-init user code here
        }//GEN-BEGIN:|132-getter|2|
        return textField8;
    }
//</editor-fold>//GEN-END:|132-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|139-getter|0|139-preInit
    /**
     * Returns an initialized instance of okCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|139-getter|0|139-preInit
            // write pre-init user code here
            okCommand4 = new Command("Add to My Appointments", Command.OK, 0);//GEN-LINE:|139-getter|1|139-postInit
            // write post-init user code here
        }//GEN-BEGIN:|139-getter|2|
        return okCommand4;
    }
//</editor-fold>//GEN-END:|139-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand8 ">//GEN-BEGIN:|141-getter|0|141-preInit
    /**
     * Returns an initialized instance of backCommand8 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand8() {
        if (backCommand8 == null) {//GEN-END:|141-getter|0|141-preInit
            // write pre-init user code here
            backCommand8 = new Command("Back", Command.BACK, 0);//GEN-LINE:|141-getter|1|141-postInit
            // write post-init user code here
        }//GEN-BEGIN:|141-getter|2|
        return backCommand8;
    }
//</editor-fold>//GEN-END:|141-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand8 ">//GEN-BEGIN:|143-getter|0|143-preInit
    /**
     * Returns an initialized instance of exitCommand8 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand8() {
        if (exitCommand8 == null) {//GEN-END:|143-getter|0|143-preInit
            // write pre-init user code here
            exitCommand8 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|143-getter|1|143-postInit
            // write post-init user code here
        }//GEN-BEGIN:|143-getter|2|
        return exitCommand8;
    }
//</editor-fold>//GEN-END:|143-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|133-getter|0|133-preInit
    /**
     * Returns an initialized instance of form3 component.
     *
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|133-getter|0|133-preInit
            // write pre-init user code here
            form3 = new Form("Doctor Appointments", new Item[]{getTextField9(), getTextField10(), getTextField11(), getDateField()});//GEN-BEGIN:|133-getter|1|133-postInit
            form3.addCommand(getOkCommand4());
            form3.addCommand(getBackCommand8());
            form3.addCommand(getExitCommand8());
            form3.addCommand(getOkCommand6());
            form3.setCommandListener(this);//GEN-END:|133-getter|1|133-postInit
            // write post-init user code here
        }//GEN-BEGIN:|133-getter|2|
        return form3;
    }
//</editor-fold>//GEN-END:|133-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField9 ">//GEN-BEGIN:|135-getter|0|135-preInit
    /**
     * Returns an initialized instance of textField9 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField9() {
        if (textField9 == null) {//GEN-END:|135-getter|0|135-preInit
            // write pre-init user code here
            textField9 = new TextField("Doctor Name", "", 32, TextField.ANY);//GEN-LINE:|135-getter|1|135-postInit
            // write post-init user code here
        }//GEN-BEGIN:|135-getter|2|
        return textField9;
    }
//</editor-fold>//GEN-END:|135-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField10 ">//GEN-BEGIN:|136-getter|0|136-preInit
    /**
     * Returns an initialized instance of textField10 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField10() {
        if (textField10 == null) {//GEN-END:|136-getter|0|136-preInit
            // write pre-init user code here
            textField10 = new TextField("Hospital Name", "", 32, TextField.ANY);//GEN-LINE:|136-getter|1|136-postInit
            // write post-init user code here
        }//GEN-BEGIN:|136-getter|2|
        return textField10;
    }
//</editor-fold>//GEN-END:|136-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField11 ">//GEN-BEGIN:|137-getter|0|137-preInit
    /**
     * Returns an initialized instance of textField11 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField11() {
        if (textField11 == null) {//GEN-END:|137-getter|0|137-preInit
            // write pre-init user code here
            textField11 = new TextField("Hospital Address", "", 32, TextField.ANY);//GEN-LINE:|137-getter|1|137-postInit
            // write post-init user code here
        }//GEN-BEGIN:|137-getter|2|
        return textField11;
    }
//</editor-fold>//GEN-END:|137-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dateField ">//GEN-BEGIN:|138-getter|0|138-preInit
    /**
     * Returns an initialized instance of dateField component.
     *
     * @return the initialized component instance
     */
    public DateField getDateField() {
        if (dateField == null) {//GEN-END:|138-getter|0|138-preInit
            // write pre-init user code here
            dateField = new DateField("Date and Time", DateField.DATE_TIME);//GEN-BEGIN:|138-getter|1|138-postInit
            dateField.setDate(new java.util.Date(System.currentTimeMillis()));//GEN-END:|138-getter|1|138-postInit
            // write post-init user code here
        }//GEN-BEGIN:|138-getter|2|
        return dateField;
    }
//</editor-fold>//GEN-END:|138-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|149-getter|0|149-preInit
    /**
     * Returns an initialized instance of okCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {//GEN-END:|149-getter|0|149-preInit
            // write pre-init user code here
            okCommand5 = new Command("My Appointments", Command.OK, 0);//GEN-LINE:|149-getter|1|149-postInit
            // write post-init user code here
        }//GEN-BEGIN:|149-getter|2|
        return okCommand5;
    }
//</editor-fold>//GEN-END:|149-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand9 ">//GEN-BEGIN:|155-getter|0|155-preInit
    /**
     * Returns an initialized instance of backCommand9 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand9() {
        if (backCommand9 == null) {//GEN-END:|155-getter|0|155-preInit
            // write pre-init user code here
            backCommand9 = new Command("Back", Command.BACK, 0);//GEN-LINE:|155-getter|1|155-postInit
            // write post-init user code here
        }//GEN-BEGIN:|155-getter|2|
        return backCommand9;
    }
//</editor-fold>//GEN-END:|155-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand9 ">//GEN-BEGIN:|157-getter|0|157-preInit
    /**
     * Returns an initialized instance of exitCommand9 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand9() {
        if (exitCommand9 == null) {//GEN-END:|157-getter|0|157-preInit
            // write pre-init user code here
            exitCommand9 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|157-getter|1|157-postInit
            // write post-init user code here
        }//GEN-BEGIN:|157-getter|2|
        return exitCommand9;
    }
//</editor-fold>//GEN-END:|157-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list5 ">//GEN-BEGIN:|151-getter|0|151-preInit
    /**
     * Returns an initialized instance of list5 component.
     *
     * @return the initialized component instance
     */
    public List getList5() {
        if (list5 == null) {//GEN-END:|151-getter|0|151-preInit
            // write pre-init user code here
            list5 = new List("My Appointments", Choice.IMPLICIT);//GEN-BEGIN:|151-getter|1|151-postInit
            list5.addCommand(getBackCommand9());
            list5.addCommand(getExitCommand9());
            list5.setCommandListener(this);//GEN-END:|151-getter|1|151-postInit
            // write post-init user code here
        }
             list5.deleteAll();
        
       try{
           if(rs.getNumRecords()>0){
               
               reenum=rs.enumerateRecords(null, null, true);
               while(reenum.hasNextElement()){
                   
                   String newRec1=new String(reenum.nextRecord());
                   if(newRec1.startsWith("Doct")){
                      list5.append("***********************************",null);
                      list5.append("Doctor name :", null); 
                      list5.append(newRec1.substring(4), null);
                   }
                   if(newRec1.startsWith("Hosn")){
                       list5.append("Hospital name :", null); 
                     list5.append(newRec1.substring(4), null);
                   }
                   if(newRec1.startsWith("Addr")){
                       list5.append("Address :", null); 
                      list5.append(newRec1.substring(4), null);
                   }
                    if(newRec1.startsWith("Date")){
                        
                        list5.append("Date :", null); 
                      list5.append(newRec1.substring(4), null);
                    }
                 }                     
           }
       }
        catch(Exception e)    {
        
                             
        }//GEN-BEGIN:|151-getter|2|
        return list5;
    }
//</editor-fold>//GEN-END:|151-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list5Action ">//GEN-BEGIN:|151-action|0|151-preAction
    /**
     * Performs an action assigned to the selected list element in the list5
     * component.
     */
    public void list5Action() {//GEN-END:|151-action|0|151-preAction
        // enter pre-action user code here
        String __selectedString = getList5().getString(getList5().getSelectedIndex());//GEN-LINE:|151-action|1|151-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|151-action|2|
//</editor-fold>//GEN-END:|151-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand6 ">//GEN-BEGIN:|161-getter|0|161-preInit
    /**
     * Returns an initialized instance of okCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand6() {
        if (okCommand6 == null) {//GEN-END:|161-getter|0|161-preInit
            // write pre-init user code here
            okCommand6 = new Command("My Appointments", Command.OK, 0);//GEN-LINE:|161-getter|1|161-postInit
            // write post-init user code here
        }//GEN-BEGIN:|161-getter|2|
        return okCommand6;
    }
//</editor-fold>//GEN-END:|161-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand10 ">//GEN-BEGIN:|168-getter|0|168-preInit
    /**
     * Returns an initialized instance of backCommand10 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand10() {
        if (backCommand10 == null) {//GEN-END:|168-getter|0|168-preInit
            // write pre-init user code here
            backCommand10 = new Command("Back", Command.BACK, 0);//GEN-LINE:|168-getter|1|168-postInit
            // write post-init user code here
        }//GEN-BEGIN:|168-getter|2|
        return backCommand10;
    }
//</editor-fold>//GEN-END:|168-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand10 ">//GEN-BEGIN:|170-getter|0|170-preInit
    /**
     * Returns an initialized instance of exitCommand10 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand10() {
        if (exitCommand10 == null) {//GEN-END:|170-getter|0|170-preInit
            // write pre-init user code here
            exitCommand10 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|170-getter|1|170-postInit
            // write post-init user code here
        }//GEN-BEGIN:|170-getter|2|
        return exitCommand10;
    }
//</editor-fold>//GEN-END:|170-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form4 ">//GEN-BEGIN:|166-getter|0|166-preInit
    /**
     * Returns an initialized instance of form4 component.
     *
     * @return the initialized component instance
     */
    public Form getForm4() {
        if (form4 == null) {//GEN-END:|166-getter|0|166-preInit
            // write pre-init user code here
            form4 = new Form("Medics", new Item[]{getTextField12(), getTextField13(), getTextField14(), getTextField15()});//GEN-BEGIN:|166-getter|1|166-postInit
            form4.addCommand(getBackCommand10());
            form4.addCommand(getExitCommand10());
            form4.addCommand(getOkCommand8());
            form4.addCommand(getOkCommand9());
            form4.setCommandListener(this);//GEN-END:|166-getter|1|166-postInit
            // write post-init user code here
        }//GEN-BEGIN:|166-getter|2|
        return form4;
    }
//</editor-fold>//GEN-END:|166-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand7 ">//GEN-BEGIN:|178-getter|0|178-preInit
    /**
     * Returns an initialized instance of okCommand7 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand7() {
        if (okCommand7 == null) {//GEN-END:|178-getter|0|178-preInit
            // write pre-init user code here
            okCommand7 = new Command("Ok", Command.OK, 0);//GEN-LINE:|178-getter|1|178-postInit
            // write post-init user code here
        }//GEN-BEGIN:|178-getter|2|
        return okCommand7;
    }
//</editor-fold>//GEN-END:|178-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand8 ">//GEN-BEGIN:|180-getter|0|180-preInit
    /**
     * Returns an initialized instance of okCommand8 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand8() {
        if (okCommand8 == null) {//GEN-END:|180-getter|0|180-preInit
            // write pre-init user code here
            okCommand8 = new Command("Add this ", Command.OK, 0);//GEN-LINE:|180-getter|1|180-postInit
            // write post-init user code here
        }//GEN-BEGIN:|180-getter|2|
        return okCommand8;
    }
//</editor-fold>//GEN-END:|180-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand9 ">//GEN-BEGIN:|182-getter|0|182-preInit
    /**
     * Returns an initialized instance of okCommand9 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand9() {
        if (okCommand9 == null) {//GEN-END:|182-getter|0|182-preInit
            // write pre-init user code here
            okCommand9 = new Command("View Medicines", Command.OK, 0);//GEN-LINE:|182-getter|1|182-postInit
            // write post-init user code here
        }//GEN-BEGIN:|182-getter|2|
        return okCommand9;
    }
//</editor-fold>//GEN-END:|182-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField12 ">//GEN-BEGIN:|174-getter|0|174-preInit
    /**
     * Returns an initialized instance of textField12 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField12() {
        if (textField12 == null) {//GEN-END:|174-getter|0|174-preInit
            // write pre-init user code here
            textField12 = new TextField("Medicine Name", "", 32, TextField.ANY);//GEN-LINE:|174-getter|1|174-postInit
            // write post-init user code here
        }//GEN-BEGIN:|174-getter|2|
        return textField12;
    }
//</editor-fold>//GEN-END:|174-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField13 ">//GEN-BEGIN:|175-getter|0|175-preInit
    /**
     * Returns an initialized instance of textField13 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField13() {
        if (textField13 == null) {//GEN-END:|175-getter|0|175-preInit
            // write pre-init user code here
            textField13 = new TextField("Morning", "", 32, TextField.ANY);//GEN-LINE:|175-getter|1|175-postInit
            // write post-init user code here
        }//GEN-BEGIN:|175-getter|2|
        return textField13;
    }
//</editor-fold>//GEN-END:|175-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField14 ">//GEN-BEGIN:|176-getter|0|176-preInit
    /**
     * Returns an initialized instance of textField14 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField14() {
        if (textField14 == null) {//GEN-END:|176-getter|0|176-preInit
            // write pre-init user code here
            textField14 = new TextField("Noon", "", 32, TextField.ANY);//GEN-LINE:|176-getter|1|176-postInit
            // write post-init user code here
        }//GEN-BEGIN:|176-getter|2|
        return textField14;
    }
//</editor-fold>//GEN-END:|176-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField15 ">//GEN-BEGIN:|177-getter|0|177-preInit
    /**
     * Returns an initialized instance of textField15 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField15() {
        if (textField15 == null) {//GEN-END:|177-getter|0|177-preInit
            // write pre-init user code here
            textField15 = new TextField("Night", "", 32, TextField.ANY);//GEN-LINE:|177-getter|1|177-postInit
            // write post-init user code here
        }//GEN-BEGIN:|177-getter|2|
        return textField15;
    }
//</editor-fold>//GEN-END:|177-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list6 ">//GEN-BEGIN:|184-getter|0|184-preInit
    /**
     * Returns an initialized instance of list6 component.
     *
     * @return the initialized component instance
     */
    public List getList6() {
        if (list6 == null) {//GEN-END:|184-getter|0|184-preInit
            // write pre-init user code here
            list6 = new List("Medicine Details", Choice.IMPLICIT);//GEN-BEGIN:|184-getter|1|184-postInit
            list6.addCommand(getBackCommand11());
            list6.addCommand(getExitCommand11());
            list6.setCommandListener(this);//GEN-END:|184-getter|1|184-postInit
            }
        list6.deleteAll();
        try{
               if(rs.getNumRecords()>0){
                   reenum=rs.enumerateRecords(null, null, true);
                   while(reenum.hasNextElement()){
                     newRec=new String(reenum.nextRecord());
                     if(newRec.startsWith("Medn")){
                         list6.append("Medicine :", null);
                         list6.append(newRec.substring(4), null);
                         }
                     if(newRec.startsWith("Morn")){
                         list6.append("Morning :", null);
                         list6.append(newRec.substring(4), null);
                     }
                     if(newRec.startsWith("Noon")){
                         list6.append("Noon ", null);
                         list6.append(newRec.substring(4), null);
                     }
                     if(newRec.startsWith("Nite")){
                         list6.append("Night ", null);
                         list6.append(newRec.substring(4), null);
                     }
                   }
                   //Spacer spacer12=new Spacer(16,1);
                   
               }
            }
            catch(Exception e){
                
        }//GEN-BEGIN:|184-getter|2|
        return list6;
    }
//</editor-fold>//GEN-END:|184-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list6Action ">//GEN-BEGIN:|184-action|0|184-preAction
    /**
     * Performs an action assigned to the selected list element in the list6
     * component.
     */
    public void list6Action() {//GEN-END:|184-action|0|184-preAction
        // enter pre-action user code here
        String __selectedString = getList6().getString(getList6().getSelectedIndex());//GEN-LINE:|184-action|1|184-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|184-action|2|
//</editor-fold>//GEN-END:|184-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand11 ">//GEN-BEGIN:|188-getter|0|188-preInit
    /**
     * Returns an initialized instance of backCommand11 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand11() {
        if (backCommand11 == null) {//GEN-END:|188-getter|0|188-preInit
            // write pre-init user code here
            backCommand11 = new Command("Back", Command.BACK, 0);//GEN-LINE:|188-getter|1|188-postInit
            // write post-init user code here
        }//GEN-BEGIN:|188-getter|2|
        return backCommand11;
    }
//</editor-fold>//GEN-END:|188-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand11 ">//GEN-BEGIN:|190-getter|0|190-preInit
    /**
     * Returns an initialized instance of exitCommand11 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand11() {
        if (exitCommand11 == null) {//GEN-END:|190-getter|0|190-preInit
            // write pre-init user code here
            exitCommand11 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|190-getter|1|190-postInit
            // write post-init user code here
        }//GEN-BEGIN:|190-getter|2|
        return exitCommand11;
    }
//</editor-fold>//GEN-END:|190-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form5 ">//GEN-BEGIN:|194-getter|0|194-preInit
    /**
     * Returns an initialized instance of form5 component.
     *
     * @return the initialized component instance
     */
    public Form getForm5() {
        if (form5 == null) {//GEN-END:|194-getter|0|194-preInit
            // write pre-init user code here
            form5 = new Form("Add Task", new Item[]{getTextField16(), getTextField17(), getDateField1()});//GEN-BEGIN:|194-getter|1|194-postInit
            form5.addCommand(getOkCommand10());
            form5.addCommand(getExitCommand12());
            form5.addCommand(getBackCommand12());
            form5.addCommand(getOkCommand11());
            form5.setCommandListener(this);//GEN-END:|194-getter|1|194-postInit
            // write post-init user code here
        }//GEN-BEGIN:|194-getter|2|
        return form5;
    }
//</editor-fold>//GEN-END:|194-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField16 ">//GEN-BEGIN:|196-getter|0|196-preInit
    /**
     * Returns an initialized instance of textField16 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField16() {
        if (textField16 == null) {//GEN-END:|196-getter|0|196-preInit
            // write pre-init user code here
            textField16 = new TextField("Task Name", "", 32, TextField.ANY);//GEN-LINE:|196-getter|1|196-postInit
            // write post-init user code here
        }//GEN-BEGIN:|196-getter|2|
        return textField16;
    }
//</editor-fold>//GEN-END:|196-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField17 ">//GEN-BEGIN:|197-getter|0|197-preInit
    /**
     * Returns an initialized instance of textField17 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField17() {
        if (textField17 == null) {//GEN-END:|197-getter|0|197-preInit
            // write pre-init user code here
            textField17 = new TextField("Task Description", "", 32, TextField.ANY);//GEN-LINE:|197-getter|1|197-postInit
            // write post-init user code here
        }//GEN-BEGIN:|197-getter|2|
        return textField17;
    }
//</editor-fold>//GEN-END:|197-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dateField1 ">//GEN-BEGIN:|198-getter|0|198-preInit
    /**
     * Returns an initialized instance of dateField1 component.
     *
     * @return the initialized component instance
     */
    public DateField getDateField1() {
        if (dateField1 == null) {//GEN-END:|198-getter|0|198-preInit
            // write pre-init user code here
            dateField1 = new DateField("Select Date and Time", DateField.DATE_TIME);//GEN-BEGIN:|198-getter|1|198-postInit
            dateField1.setDate(new java.util.Date(System.currentTimeMillis()));//GEN-END:|198-getter|1|198-postInit
            // write post-init user code here
        }//GEN-BEGIN:|198-getter|2|
        return dateField1;
    }
//</editor-fold>//GEN-END:|198-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand10 ">//GEN-BEGIN:|199-getter|0|199-preInit
    /**
     * Returns an initialized instance of okCommand10 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand10() {
        if (okCommand10 == null) {//GEN-END:|199-getter|0|199-preInit
            // write pre-init user code here
            okCommand10 = new Command("Add this Task", Command.OK, 0);//GEN-LINE:|199-getter|1|199-postInit
            // write post-init user code here
        }//GEN-BEGIN:|199-getter|2|
        return okCommand10;
    }
//</editor-fold>//GEN-END:|199-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand12 ">//GEN-BEGIN:|201-getter|0|201-preInit
    /**
     * Returns an initialized instance of exitCommand12 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand12() {
        if (exitCommand12 == null) {//GEN-END:|201-getter|0|201-preInit
            // write pre-init user code here
            exitCommand12 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|201-getter|1|201-postInit
            // write post-init user code here
        }//GEN-BEGIN:|201-getter|2|
        return exitCommand12;
    }
//</editor-fold>//GEN-END:|201-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand12 ">//GEN-BEGIN:|203-getter|0|203-preInit
    /**
     * Returns an initialized instance of backCommand12 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand12() {
        if (backCommand12 == null) {//GEN-END:|203-getter|0|203-preInit
            // write pre-init user code here
            backCommand12 = new Command("Back", Command.BACK, 0);//GEN-LINE:|203-getter|1|203-postInit
            // write post-init user code here
        }//GEN-BEGIN:|203-getter|2|
        return backCommand12;
    }
//</editor-fold>//GEN-END:|203-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand11 ">//GEN-BEGIN:|205-getter|0|205-preInit
    /**
     * Returns an initialized instance of okCommand11 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand11() {
        if (okCommand11 == null) {//GEN-END:|205-getter|0|205-preInit
            // write pre-init user code here
            okCommand11 = new Command("View Tasks", Command.OK, 0);//GEN-LINE:|205-getter|1|205-postInit
            // write post-init user code here
        }//GEN-BEGIN:|205-getter|2|
        return okCommand11;
    }
//</editor-fold>//GEN-END:|205-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list7 ">//GEN-BEGIN:|207-getter|0|207-preInit
    /**
     * Returns an initialized instance of list7 component.
     *
     * @return the initialized component instance
     */
    public List getList7() {
        if (list7 == null) {//GEN-END:|207-getter|0|207-preInit
            // write pre-init user code here
            list7 = new List("Tasks ", Choice.IMPLICIT);//GEN-BEGIN:|207-getter|1|207-postInit
            list7.addCommand(getBackCommand13());
            list7.addCommand(getExitCommand13());
            list7.setCommandListener(this);//GEN-END:|207-getter|1|207-postInit
            // write post-init user code here
            }try {
            list7.deleteAll();
                String newRecord;
                if(recordStore.getNumRecords()>0){
                    reenum=recordStore.enumerateRecords(null, null, true);
                    while(reenum.hasNextElement()){
                        try {
                            newRecord=new String(reenum.nextRecord());
                            if(newRecord.startsWith("Task")){
                                list7.append("Task :", null);
                          
                                list7.append(newRecord.substring(4,newRecord.length()), null);
                            }
                            if(newRecord.startsWith("Desc")){
                                list7.append("Task Description :", null);
                                list7.append(newRecord.substring(4,newRecord.length()), null);
                            }
                            if(newRecord.startsWith("Date")){
                                list7.append("Task Date ", null);
                                list7.append(newRecord.substring(4,newRecord.length()), null);
                            }
                           
                        } catch (InvalidRecordIDException ex) {
                            ex.printStackTrace();
                        } catch (RecordStoreNotOpenException ex) {
                            ex.printStackTrace();
                        } catch (RecordStoreException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            } catch (RecordStoreNotOpenException ex) {
                ex.printStackTrace();
        }//GEN-BEGIN:|207-getter|2|
        return list7;
    }
//</editor-fold>//GEN-END:|207-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: list7Action ">//GEN-BEGIN:|207-action|0|207-preAction
    /**
     * Performs an action assigned to the selected list element in the list7
     * component.
     */
    public void list7Action() {//GEN-END:|207-action|0|207-preAction
        // enter pre-action user code here
        String __selectedString = getList7().getString(getList7().getSelectedIndex());//GEN-LINE:|207-action|1|207-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|207-action|2|
//</editor-fold>//GEN-END:|207-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand13 ">//GEN-BEGIN:|211-getter|0|211-preInit
    /**
     * Returns an initialized instance of backCommand13 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand13() {
        if (backCommand13 == null) {//GEN-END:|211-getter|0|211-preInit
            // write pre-init user code here
            backCommand13 = new Command("Back", Command.BACK, 0);//GEN-LINE:|211-getter|1|211-postInit
            // write post-init user code here
        }//GEN-BEGIN:|211-getter|2|
        return backCommand13;
    }
//</editor-fold>//GEN-END:|211-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand13 ">//GEN-BEGIN:|213-getter|0|213-preInit
    /**
     * Returns an initialized instance of exitCommand13 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand13() {
        if (exitCommand13 == null) {//GEN-END:|213-getter|0|213-preInit
            // write pre-init user code here
            exitCommand13 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|213-getter|1|213-postInit
            // write post-init user code here
        }//GEN-BEGIN:|213-getter|2|
        return exitCommand13;
    }
//</editor-fold>//GEN-END:|213-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
