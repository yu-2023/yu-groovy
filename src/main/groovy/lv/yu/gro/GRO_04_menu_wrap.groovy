
/**
 *
 * Groovy package     lv.yu.gro
 *
 * Groovy program     GRO_04_menu_wrap.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023             mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JScrollPane
import javax.swing.JTextArea
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JCheckBoxMenuItem
import javax.swing.KeyStroke

import java.awt.BorderLayout

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

/** GRO_04_menu_wrap */
public final class GRO_04_menu_wrap_class {

    /** frame */
    public static JFrame frame = new JFrame()

    /** manubar */
    public static JMenuBar menubar = new JMenuBar()

//------------------------------

/** GRO_04_menu_wrap demonstrates Groovy Menu Wrap in Groovy Frame */
public GRO_04_menu_wrap_class() {

        var imgURL =               GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg")
    var icon_frame = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg"))

//------------------------------

    var title = "GROOVY -- GRO_04_menu_wrap -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+3*40, 10+3*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

//------------------------------

    var icon_Start       = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/start.gif"))
    var icon_Load        = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/load.gif"))
    var icon_Xxxx        = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/xxxx.png"))
    var icon_Information = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/information.gif"))
    var icon_Help        = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/help.png"))
    var icon_About       = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/about.gif"))
    var icon_Eng         = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/prefs.gif"))
    var icon_Rus         = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/prefs.gif"))
    var icon_Lat         = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/prefs.gif"))
    var icon_Exit        = new ImageIcon(GRO_04_menu_wrap_class.class.getResource("/lv/yu/gro/GRO_resources/exit.png"))

//------------------------------

    var menu_Menu = new JMenu("Menu")
      var item_Start = new JMenuItem("Start", icon_Start)
      var item_Load  = new JMenuItem("Load", icon_Load)
      var item_Xxxx  = new JMenuItem("Xxxx", icon_Xxxx)

    var menu_Start1 = new JMenu("Start1")
      var item_St11 = new JMenuItem("St11")
      var item_St12 = new JMenuItem("St12")

    var menu_Start2 = new JMenu("Start2")
      var item_St21 = new JMenuItem("St21")
      var item_St22 = new JMenuItem("St22")

    var menu_Start3 = new JMenu("Start3")
      var item_St31 = new JMenuItem("St31")
      var item_St32 = new JMenuItem("St32")

    var menu_Help = new JMenu("Help")
      var item_Information = new JMenuItem("Information", icon_Information)
      var item_Help        = new JMenuItem("Help", icon_Help)
      var item_About       = new JMenuItem("About", icon_About)

    var menu_Lang = new JMenu("Lang")
      var item_Eng = new JCheckBoxMenuItem("Eng", icon_Eng)
      var item_Rus = new JCheckBoxMenuItem("Rus", icon_Rus)
      var item_Lat = new JCheckBoxMenuItem("Lat", icon_Lat)

    var menu_Exit = new JMenu("Exit")
      var item_Exit = new JMenuItem("Exit", icon_Exit)

//------------------------------

        menu_Menu.setMnemonic(KeyEvent.VK_M)  //  Alt M
        menu_Menu.setToolTipText("Menu commands")
          item_Start.setToolTipText("Start application")
          item_Load.setToolTipText("Load application")
          item_Xxxx.setToolTipText("Xxxx application")
          item_Start.setAccelerator(KeyStroke.getKeyStroke (KeyEvent.VK_S, ActionEvent.ALT_MASK) )  //  Alt S
          item_Load.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_L, ActionEvent.ALT_MASK) )  //  Alt L
          item_Xxxx.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_X, ActionEvent.ALT_MASK) )  //  Alt X

        menu_Start1.setMnemonic(KeyEvent.VK_1)  //  Alt 1
        menu_Start1.setToolTipText("Start1 commands")
          item_St11.setToolTipText("St11 application")
          item_St12.setToolTipText("St12 application")

        menu_Start2.setMnemonic(KeyEvent.VK_2)  //  Alt 2
        menu_Start2.setToolTipText("Start2 commands")
          item_St21.setToolTipText("St21 application")
          item_St22.setToolTipText("St22 application")

        menu_Start3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
        menu_Start3.setToolTipText("Start3 commands")
          item_St31.setToolTipText("St31 application")
          item_St32.setToolTipText("St32 application")

        menu_Help.setMnemonic(KeyEvent.VK_H)  //  Alt H
        menu_Help.setToolTipText("Help commands")
          item_Information.setToolTipText("Information application")
          item_Help.setToolTipText("Help application")
          item_About.setToolTipText("About application")

        menu_Lang.setMnemonic(KeyEvent.VK_L)  //  Alt L
        menu_Lang.setToolTipText("Lang commands")
          item_Eng.setToolTipText("Eng application")
          item_Rus.setToolTipText("Rus application")
          item_Lat.setToolTipText("Lat application")
          item_Eng.setSelected(true);

        menu_Exit.setMnemonic(KeyEvent.VK_E)  //  Alt E
        menu_Exit.setToolTipText("Exit commands")
          item_Exit.setToolTipText("Exit application")

//------------------------------

        menu_Menu.add(item_Start)
        menu_Menu.add(item_Load)
        menu_Menu.add(item_Xxxx)

        menu_Start1.add(item_St11)
        menu_Start1.add(item_St12)

        menu_Start2.add(item_St21)
        menu_Start2.add(item_St22)

        menu_Start3.add(item_St31)
        menu_Start3.add(item_St32)

        menu_Help.add(item_Information)
        menu_Help.add(item_Help)
        menu_Help.add(item_About)

        menu_Lang.add(item_Eng)
        menu_Lang.add(item_Rus)
        menu_Lang.add(item_Lat)

        menu_Exit.add(item_Exit)

        menubar.add(menu_Menu)
        menubar.add(menu_Start1)
        menubar.add(menu_Start2)
        menubar.add(menu_Start3)
        menubar.add(menu_Help)
        menubar.add(menu_Lang)
        menubar.add(menu_Exit)

        menubar.setLayout( new lv.yu.gro.JAV_LIB_wrap_layout (lv.yu.gro.JAV_LIB_wrap_layout.LEFT, 0, 0) )

//------------------------------

        frame.setJMenuBar(menubar)

//------------------------------

    var textarea = new JTextArea()
    var scrollpane = new JScrollPane(textarea)

    textarea.setText("" +
"        \r\n" +
"        💞️💞️ EN\r\n" +
"        \r\n" +
"        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.\r\n" +
"        \r\n" +
"        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.\r\n" +
"        \r\n" +
"        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        👋👋 RU\r\n" +
"        \r\n" +
"        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        🌱🌱 LV\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.\r\n" +
"        \r\n" +
"        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.\r\n" +
"        \r\n" +
                     "")

        frame.getContentPane().add(scrollpane, BorderLayout.CENTER)

        frame.setVisible(true)

//------------------------------

    }  //  end GRO_04_menu_wrap_class()

//------------------------------

}  //  end GRO_04_menu_wrap_class

//------------------------------

/**
 * GRO_04_menu_wrap
 *
 * @param args[]
 */
    public static void main(String[] args) {
                                             SwingUtilities.invokeLater( () -> { new GRO_04_menu_wrap_class() } )
    }  //  end main

//------------------------------
