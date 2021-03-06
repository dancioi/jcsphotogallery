/*	
 * 	File    : GalleryException.java
 * 
 * 	Copyright (C) 2013 Daniel Cioi <dan@dancioi.net>
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
package net.dancioi.jcsphotogallery.app.model;

/**
 * @author Daniel Cioi <dan@dancioi.net>
 * @version $Revision: 43 $ Last modified: $Date: 2013-09-04 22:39:16 +0200 (Tue, 04 Sep 2013) $, by: $Author: dan.cioi@gmail.com $
 */
public class GalleryException extends Exception {

	private static final long serialVersionUID = 1L;

	public GalleryException(Exception exception) {
		super(exception.getMessage(), exception);
		logMessage(exception);
	}

	private void logMessage(Exception exception) {
		exception.printStackTrace();
		// add log file if it will be required
	}

}
