package AbstractFactory;
// Abstract factory 

import java.util.Scanner;

interface IButton{
    public void press();
}

class MacButton implements IButton{

    public void press(){
        System.out.println("Mac button pressed");
    }

}

class WinButton implements IButton{

    public void press(){
        System.out.println("Win button pressed");
    }

}

interface ITextBox{
    public void showText();
}

class MacTextBox implements ITextBox{

    public void showText(){
        System.out.println("Showing Mac Textbox ");
    }

}

class WinTextBox implements ITextBox{

    public void showText(){
        System.out.println("Showing Win Textbox");
    }
}

interface IFactory{
    IButton CreateButton();
    ITextBox CreateTextBox();
}

class MacFactory implements IFactory{

    public IButton CreateButton(){
        return new MacButton();
    }

    public ITextBox CreateTextBox(){
        return new MacTextBox();
    }
}

class WinFactory implements IFactory{

    public IButton CreateButton(){
        return new WinButton();
    }

    public ITextBox CreateTextBox(){
        return new WinTextBox();
    }
}


class GUIAbsFactory{

    public static IFactory CreateFactory(String osType){
        if(osType.equals("windows")){
            return new WinFactory();
        }
        else if(osType.equals("mac")){
            return new MacFactory();
        }
        else{
            return new MacFactory();
        }
    }
}

public class Main {
    
    public static void main(String[] arg){
    
    Scanner myObj = new Scanner(System.in);
    String osType;

    System.out.println("Enter your machine OS");
    osType = myObj.nextLine();

    IFactory fact = GUIAbsFactory.CreateFactory(osType);

    IButton button = fact.CreateButton();
    button.press();

    ITextBox textBox = fact.CreateTextBox();
    textBox.showText();
    }
}