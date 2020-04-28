
import resources.win32_8604_notepadCmdHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author JaspreetSinghC
 */
public class win32_8604_notepadCmd extends win32_8604_notepadCmdHelper
{
	/**
	 * Script Name   : <b>NotepadCmd</b>
	 * Generated     : <b>04-Feb-2019 6:48:34 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("cmd");
		
		//administratorCWindowsSystem32C().activate();
		//administratorCWindowsSystem32C().ensureObjectIsVisible();
		// Window: cmd.exe: Administrator: C:\Windows\System32\cmd.exe
		administratorCWindowsSystem32C().click(atPoint(173,89));
		//administratorCWindowsSystem32C().click ( administratorCWindowsSystem32C().getScreenPoint());
		administratorCWindowsSystem32C().inputKeys("cd\\{ENTER}");
		administratorCWindowsSystem32C().inputKeys("cd Users\\JaspreetSinghC\\Desktop{ENTER}");
		administratorCWindowsSystem32C().inputKeys("notepad.exe{ENTER}");
		
		// Window: notepad.exe: Untitled - Notepad
		untitledNotepadwindow().inputChars("Typing into Notepad to record a test");
		systemmenuBar().performTest(System_SystemVP());
		titlebarwin().performTest(Titlebar_textVP());
		filemenuItem().performTest(File_menuVP());
		editmenuItem().performTest(Edit_menuVP());
		formatmenuItem().performTest(Format_menuVP());
		viewmenuItem().performTest(View_extendedMenuVP());
		helpmenuItem().performTest(Help_extendedMenuVP());
		typingIntoNotepadToRecordATest().click(atPoint(326,14));
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("this i a line that will containg many characters - 123 456 &*{(}");
		untitledNotepadwindow().inputChars(" asdfgh l;;jjjjjjjjlkkkkkkkkkkkkkkkkkkkkkkkkdfdsfkhkjhkjhkjhkjhk");
		untitledNotepadwindow().inputChars("jhkjhkjhkjhkjhkjhkjh87648767463876ghjgdjghjhjgjfgdhjgdfhjgfhjgdf");
		untitledNotepadwindow().inputKeys("hjgdfgshjg787487857857{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("dhskhfkjhdsgkjhdf{ENTER}");
		untitledNotepadwindow().inputKeys("1234{ENTER}");
		untitledNotepadwindow().inputKeys("567890{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("0098877{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("Test update 1{BKSP}{BKSP}{ExtHome}{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		untitledNotepadwindow().inputKeys("{ExtUp}{ExtUp}Latest test update{ExtHome}{ENTER}");
		untitledNotepadwindow().inputKeys("{ENTER}");
		typingIntoNotepadToRecordATest().performTest(TypingIntoNotepadToRecordATest_textVP());
		typingIntoNotepadToRecordATest().doubleClick(atPoint(24,76));
		typingIntoNotepadToRecordATest().click(atPoint(19,68));
		typingIntoNotepadToRecordATest().click(
                                        CTRL_LEFT, atPoint(19,68));
		untitledNotepadwindow().inputKeys("^{LeftCtrl}");
		typingIntoNotepadToRecordATest().doubleClick(atPoint(14,120));
		typingIntoNotepadToRecordATest().drag(atPoint(39,100), atPoint(4,75));
		typingIntoNotepadToRecordATest().performTest(TypingIntoNotepadToRecordATest_selectedTextVP());
		applicationmenuBar().click(atPath("Format"));
		applicationmenuBar().click(atPath("Format->Word Wrap"));
		typingIntoNotepadToRecordATest().performTest(TypingIntoNotepadToRecordATest_text_2VP());
		applicationmenuBar().click(atPath("Format"));
		applicationmenuBar().click(atPath("Format->Word Wrap"));
		applicationmenuBar().click(atPath("Format"));
		applicationmenuBar().click(atPath("Format->Font..."));
		
		// Window: notepad.exe: Font
		comboBoxcomboBox().click(atText("Italic"));
		comboBoxcomboBox2().click(atText("10"));
		okbutton().click(atPoint(38,9));
		
		// Window: notepad.exe: Untitled - Notepad
		applicationmenuBar().click(atPath("Help"));
		applicationmenuBar().click(atPath("Help->About Notepad"));
		
		// Window: notepad.exe: About Notepad
		aboutNotepadwindow().performTest(AboutNotepad_textVP());
		graphicwin().performTest(Graphic_GraphicVP());
		aboutNotepadwindow().performTest(AboutNotepad_standardVP());
		okbutton2().performTest(OK_textVP());
		okbutton2().click(atPoint(46,11));
		
		// Window: notepad.exe: Untitled - Notepad
		applicationmenuBar().click(atPath("Help"));
		applicationmenuBar().click(atPath("Help->View Help"));
		
		
		// Window: notepad.exe: Untitled - Notepad
		applicationmenuBar().click(atPath("Edit"));
		applicationmenuBar().click(atPath("Edit->Find..."));
		
		// Window: notepad.exe: Find
		findwindow().inputKeys("test{ENTER}");
		findNextbutton().click(atPoint(40,11));
		cancelbutton().click(atPoint(44,12));
		
		// Window: notepad.exe: Untitled - Notepad
		applicationmenuBar().click(atPath("File"));
		applicationmenuBar().click(atPath("File"));
		untitledNotepadwindow(ANY,MAY_EXIT).inputKeys("^s");
		
		// Window: notepad.exe: Save As
		saveAswindow().inputChars("Notepad");
		treeViewtree().doubleClick(atPath("Desktop->This PC->Desktop"));
		savebutton().click(atPoint(38,15));
		
		// Window: notepad.exe: Notepad - Notepad
		applicationmenuBar2().click(atPath("File"));
		applicationmenuBar2(ANY,MAY_EXIT).click(atPath("File->Exit"));
		
		// Window: cmd.exe: Administrator: C:\Windows\System32\cmd.exe
		administratorCWindowsSystem32C().click(atPoint(269,189));
		
		// Window: cmd.exe: Select Administrator: C:\Windows\System32\cmd.exe
		selectAdministratorCWindowsSys().inputKeys("notepad.txt{ENTER}");
		
		// Window: notepad.exe: Notepad - Notepad
		typingIntoNotepadToRecordATest2().click(atPoint(4,249));
		notepadNotepadwindow().inputKeys("latest test update{ENTER}");
		notepadNotepadwindow().inputKeys("{ENTER}");
		typingIntoNotepadToRecordATest2().dragToScreenPoint(
                                        atPoint(133,247), 
                                        atPoint(832,633));
		typingIntoNotepadToRecordATest2().performTest(TypingIntoNotepadToRecordATest_selectedText_2VP());
		applicationmenuBar2().click(atPath("File"));
		typingIntoNotepadToRecordATest2().click(atPoint(147,254));
		applicationmenuBar2().click(atPath("View"));
		applicationmenuBar2().click(atPath("Format->Font..."));
		
		// Window: NOTEPAD.EXE: Font
		comboBoxcomboBox4().click(atText("Regular"));
		comboBoxcomboBox5().dragToScreenPoint(atPoint(1318,555));
		comboBoxcomboBox5().click(atText("8"));
		okbutton3().click(atPoint(55,14));
		
		// Window: notepad.exe: Notepad - Notepad
		notepadNotepadwindow().inputKeys("{LeftAlt}");
		notepadNotepadwindow(ANY,MAY_EXIT).click(CLOSE_BUTTON);
		
		// Window: NOTEPAD.EXE: Notepad
		cancelbutton2().click(atPoint(31,15));
		
		// Window: notepad.exe: Notepad - Notepad
		notepadNotepadwindow().inputKeys("^s");
		notepadNotepadwindow(ANY,MAY_EXIT).click(CLOSE_BUTTON);
				
		
		// Window: cmd.exe: Select Administrator: C:\Windows\System32\cmd.exe
		selectAdministratorCWindowsSys().click(atPoint(268,221));
		selectAdministratorCWindowsSys().inputChars("notepad.exe");
		
		// Window: cmd.exe: Administrator: C:\Windows\System32\cmd.exe
		administratorCWindowsSystem32C().inputKeys("{ENTER}");
		
		// Window: notepad.exe: Untitled - Notepad
		applicationmenuBar().click(atPath("File"));
		applicationmenuBar().click(atPath("File->Open..."));
		
		// Window: notepad.exe: Open
		openwindow().inputKeys("notepadxx{ENTER}");
		
		// Window: notepad.exe: Open
		openpanel().performTest(Open_standard_2VP());
		mainInstructionIconwin().performTest(MainInstructionIcon_MainInstructionIcon_2VP());
		okbutton4().click(atPoint(44,12));
		
		// Window: notepad.exe: Open
		openwindow().inputKeys("notepad{ENTER}");
		
		// Window: notepad.exe: Notepad - Notepad
		typingIntoNotepadToRecordATest2().click(atPoint(3,199));
		notepadNotepadwindow().inputKeys("latest test update{ENTER}");
		notepadNotepadwindow().inputKeys("{ENTER}");
		applicationmenuBar2().click(atPath("File"));
		applicationmenuBar2().click(atPath("File->Save"));
		notepadNotepadwindow(ANY,MAY_EXIT).click(CLOSE_BUTTON);
		
				
		// Window: cmd.exe: Administrator: C:\Windows\System32\cmd.exe
		administratorCWindowsSystem32C(ANY,MAY_EXIT).click(CLOSE_BUTTON);
		
	}
}

