import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class MenuCreation extends MIDlet implements CommandListener {
public ChoiceGroup ch;
public Form form;
public Display display;
public Command command;
public StringItem st;
public MenuCreation()
{
display=Display.getDisplay(this);
ch=new ChoiceGroup("Edit",Choice.EXCLUSIVE);
ch.append("cut",null);
ch.append("copy",null);
ch.append("paste",null);
ch.append("delete",null);
ch.append("select all",null);
ch.append("unselect all",null);
ch.setSelectedIndex(1, true);
command=new Command("Select list item",Command.OK,1);
form=new Form("");
form.append(ch);
form.addCommand(command);
form.setCommandListener(this);
st=new StringItem("","");
}
public void startApp() {
display.setCurrent(form);
}
public void pauseApp() {
}
public void destroyApp(boolean unconditional) {
}
public void commandAction(Command command,Displayable displayable)
{
if(command==command)
{
st.setText("");
st.setText("your selected option is "+ch.getString(ch.getSelectedIndex()));
form.append(st);
}
}
}