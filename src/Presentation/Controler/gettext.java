package Presentation.Controler;

import java.util.ArrayList;

import javafx.scene.control.*;

public class gettext {
	 private static gettext instance = new gettext();
     public static gettext getInstance(){
         return instance;
     }

     private Hyperlink txt1;
     private Button but1,but2,but3,but4,but5,but6;
     private TextField txt,txt2,txt3,txt4;
     private ArrayList<Hyperlink> hyps;
     private TitledPane pane;
     private Label lab;
     

     public Label getLab() {
		return lab;
	}

	public void setLab(Label lab) {
		this.lab = lab;
	}

	public ArrayList<Hyperlink> getHyps() {
		return hyps;
	}

	public void setHyps(ArrayList<Hyperlink> hyps) {
		this.hyps = hyps;
	}

	public TitledPane getPane() {
		return pane;
	}

	public void setPane(TitledPane pane) {
		this.pane = pane;
	}

	public Hyperlink gettxt1() {
         return txt1;
     }

     public void settxt1(Hyperlink txt1) {
        this.txt1 = txt1;
     }

	public Button getBut1() {
		return but1;
	}

	public void setBut1(Button but) {
		this.but1 = but;
	}

	public Hyperlink getTxt1() {
		return txt1;
	}

	public void setTxt1(Hyperlink txt1) {
		this.txt1 = txt1;
	}

	public Button getBut2() {
		return but2;
	}

	public void setBut2(Button but2) {
		this.but2 = but2;
	}

	public Button getBut3() {
		return but3;
	}

	public void setBut3(Button but3) {
		this.but3 = but3;
	}

	public Button getBut4() {
		return but4;
	}

	public void setBut4(Button but4) {
		this.but4 = but4;
	}

	public Button getBut5() {
		return but5;
	}

	public void setBut5(Button but5) {
		this.but5 = but5;
	}

	public Button getBut6() {
		return but6;
	}

	public TextField getTxt2() {
		return txt2;
	}

	public void setTxt2(TextField txt2) {
		this.txt2 = txt2;
	}

	public TextField getTxt3() {
		return txt3;
	}

	public void setTxt3(TextField txt3) {
		this.txt3 = txt3;
	}

	public TextField getTxt4() {
		return txt4;
	}

	public void setTxt4(TextField txt4) {
		this.txt4 = txt4;
	}

	public void setBut6(Button but6) {
		this.but6 = but6;
	}

	public TextField getTxt() {
		return txt;
	}

	public void setTxt(TextField txt) {
		this.txt = txt;
	}
     
    

}
