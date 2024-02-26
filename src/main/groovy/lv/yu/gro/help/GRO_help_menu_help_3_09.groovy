
/**
 *
 * Groovy package     lv.yu.gro.help
 *
 * Groovy program     GRO_help_menu_help_3_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_help_menu_help_3_09
 */
public class GRO_help_menu_help_3_09_class {

/**
 * GRO_help_menu_help_3_09()
 */
    public GRO_help_menu_help_3_09_class() {

        var menu_Help_3 = new JMenu("Help3")
            menu_Help_3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
            menu_Help_3.setToolTipText("Help3 commands")

        var menuitem_He31 = new JMenuItem("He31")
            menuitem_He31.setToolTipText("He31 application")
            menuitem_He31.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Help_3.add(menuitem_He31)

        var menuitem_He32 = new JMenuItem("He32")
            menuitem_He32.setToolTipText("He32 application")
            menuitem_He32.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Help_3.add(menuitem_He32)

            lv.yu.gro.GRO_09_internal_frames_change_class.menubar.add(menu_Help_3)

    }  //  end GRO_help_menu_help_3_09_class()

}  //  end GRO_help_menu_help_3_09_class
