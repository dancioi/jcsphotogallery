/*	
 * 	File    : LoginPanel.java
 * 
 * 	Copyright (C) 2011 Daniel Cioi <dan@dancioi.net>
 *                              
 *	www.dancioi.net/projects/Jcsphotogallery
 *
 *	This file is part of Jcsphotogallery.
 *
 *  Jcsphotogallery is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Jcsphotogallery is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Jcsphotogallery.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package net.dancioi.jcsphotogallery.admin;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;


/**
 * The Login Panel. 
 * Check the Username and Password to login on WebDAV.
 *  
 * @version 1.0 
 * @author Daniel Cioi <dan@dancioi.net>
 */


public class LoginPanel extends PopupPanel{
	
	AbsolutePanel apLogin;
	private int pw = 300; // popup width
	private int ph = 150; // popup height
	
	
	public LoginPanel(){
		initialize();
	}
	
	
	
	/**
	 * Initialize
	 */
	private void initialize(){
		setGlassStyleName("gwt-PopupPanelGlass");
		setGlassEnabled(true); 


		apLogin = new AbsolutePanel();
		apLogin.setPixelSize(pw, ph);	
		apLogin.setStyleName("popUpPanel");

	
		Label titleLabel = new Label("JcsPhotoGallery Admin Login");
		apLogin.add(titleLabel,50,10);
		
		Label usernameLabel = new Label("Username");
		apLogin.add(usernameLabel,20,50);
		
		Label passwordLabel = new Label("Pasword");
		apLogin.add(passwordLabel,20,80);
		
		
		TextBox usernameText = new TextBox();
		usernameText.setWidth("170px");
		apLogin.add(usernameText,100,50);
		
		PasswordTextBox passwordText = new PasswordTextBox();
		passwordText.setWidth("170px");
		apLogin.add(passwordText,100,80);
		
		
		Button loginButton = new Button("Login");
		loginButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// check login
				;}} );
		
		apLogin.add(loginButton,245,120);
		
		setPosition();
		setWidget(apLogin);
	}
	
	
	
	/**
	 * Method to set the popup panel position.
	 */
	private void setPosition(){		
		setPopupPosition((Window.getClientWidth()-pw)/2,(Window.getClientHeight()-ph)/2); 
	}

	
	

}