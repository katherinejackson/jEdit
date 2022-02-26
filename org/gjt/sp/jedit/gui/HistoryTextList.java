/*
 * HistoryTextList.java - List of search history
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.gjt.sp.jedit.gui;

import java.util.ArrayList;
import javax.swing.JList;

/**
 * List of search history.
 * @author Katherine Jackson
 */
public class HistoryTextList extends JList {

    //{{{ HistoryTextList constructor
	public HistoryTextList(HistoryText controller)
	{
        super();
		this.controller = controller;
        this.updateList();
	} //}}}

    //{{{ updateList method
	/**
	 * Updates the list to display the most recent 5 search items 
     * in the the history text model.
	 */
    public void updateList()
    {
        ArrayList<String> items = new ArrayList<String>();

		for(int i = 0; i < controller.getModel().getSize() && i < 5; i++)
		{
			String item = controller.getModel().getItem(i);
			items.add(item);
		}

        items.toArray();
        this.setListData(items.toArray());
    }

    //{{{ Protected variables
    protected HistoryText controller;
    //}}}
}
