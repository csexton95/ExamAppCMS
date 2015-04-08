
package edu.saintjoe.cs.brianc.examtwo;


import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Form;

import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;
import com.google.devtools.simple.runtime.components.android.AccelerometerSensor;

import com.google.devtools.simple.runtime.events.EventDispatcher;

public class ExamActivity extends Form implements HandlesEventDispatching {

	private HorizontalArrangement line1, line2, line3, line4, line5;
	private Button incButton;
	private Label resultLabel;
	private Label promptLabel;
	private TextBox inputBox;
	private Label outputLabel;
	int temp;
	// makes all of the buttons, labels, and textboxes, a private instance so only certain people can change it

 void $define() {
 	
     this.BackgroundColor(COLOR_WHITE);
     // makes background color white
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);
     line4 = new HorizontalArrangement(this);
     // shows 
     
     promptLabel = new Label(line1, "Enter a number:");
     inputBox = new TextBox(line1);
     inputBox.NumbersOnly(true);
     // makes only numbers albe to be input in the input box
     incButton = new Button(line2,"Double it:"); 
     
     resultLabel = new Label(line3,"");
     
     outputLabel = new Label(line4, "");
 
     EventDispatcher.registerEventForDelegation(this, "ButtonClick", "Click");
    
 } 

} 
