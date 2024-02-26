
/**
 *
 * Groovy package     lv.yu.gro.load
 *
 * Groovy program     GRO_load_menu_load_2_09.groovy     Apache License 2.0
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
 * GRO_load_menu_load_2_09
 */
public class GRO_load_menu_load_2_09_class {

/**
 * GRO_load_menu_load_2_09()
 */
    public GRO_load_menu_load_2_09_class() {

        var menu_Load_2 = new JMenu("Load2")
            menu_Load_2.setMnemonic(KeyEvent.VK_2)  //  Alt 2
            menu_Load_2.setToolTipText("Load2 commands")

        var menuitem_Lo21 = new JMenuItem("Lo21")
            menuitem_Lo21.setToolTipText("Lo21 application")
            menuitem_Lo21.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_2.add(menuitem_Lo21)

        var menuitem_Lo22 = new JMenuItem("Lo22")
            menuitem_Lo22.setToolTipText("Lo22 application")
            menuitem_Lo22.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_2.add(menuitem_Lo22)

            lv.yu.gro.GRO_09_internal_frames_change_class.menubar.add(menu_Load_2)

    }  //  end GRO_load_menu_load_2_09_class()

}  //  end GRO_load_menu_load_2_09_class
