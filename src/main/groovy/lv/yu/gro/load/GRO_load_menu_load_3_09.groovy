
/**
 *
 * Groovy package     lv.yu.gro.load
 *
 * Groovy program     GRO_load_menu_load_3_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_load_menu_load_3_09
 */
public class GRO_load_menu_load_3_09_class {

/**
 * GRO_load_menu_load_3_09()
 */
    public GRO_load_menu_load_3_09_class() {

    	var menu_Load_3 = new JMenu("Load3")
            menu_Load_3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
            menu_Load_3.setToolTipText("Load3 commands")

        var menuitem_Lo31 = new JMenuItem("Lo31")
            menuitem_Lo31.setToolTipText("Lo31 application")
            menuitem_Lo31.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_3.add(menuitem_Lo31)

        var menuitem_Lo32 = new JMenuItem("Lo32")
            menuitem_Lo32.setToolTipText("Lo32 application")
            menuitem_Lo32.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_3.add(menuitem_Lo32)

            lv.yu.gro.GRO_09_internal_frames_change_class.menubar.add(menu_Load_3)

    }  //  end GRO_load_menu_load_3_09_class()

}  //  end GRO_load_menu_load_3_09_class
