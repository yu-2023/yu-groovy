
/**
 *
 * Groovy package     lv.yu.gro.help
 *
 * Groovy program     GRO_help_menu_help_1_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                      mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_help_menu_help_1_10
 */
public class GRO_help_menu_help_1_10_class {

/**
 * GRO_help_menu_help_1_10()
 */
    public GRO_help_menu_help_1_10_class() {

        var menu_Help_1 = new JMenu("Help1")
            menu_Help_1.setMnemonic(KeyEvent.VK_1)  //  Alt 1
            menu_Help_1.setToolTipText("Help1 commands")

        var menuitem_He11 = new JMenuItem("He11")
            menuitem_He11.setToolTipText("He11 application")
            menuitem_He11.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Help_1.add(menuitem_He11)

        var menuitem_He12 = new JMenuItem("He12")
            menuitem_He12.setToolTipText("He12 application")
            menuitem_He12.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Help_1.add(menuitem_He12)

            lv.yu.gro.GRO_10_tabs_class.menubar.add(menu_Help_1)

    }  //  end GRO_help_menu_help_1_10_class()

}  //  end GRO_help_menu_help_1_10_class
