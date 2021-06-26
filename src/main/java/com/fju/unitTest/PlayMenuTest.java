package com.fju.unitTest;


import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;
import com.fju.gui.UIStateController;


import javax.swing.*;

public class PlayMenuTest {


    public static void main(String[] args) {
        IUIInterface playMenu = new PlayMenu();
        UIStateController uiStateController = new UIStateController();


        JFrame frame = new JFrame();

        uiStateController.setJFrame(frame);
        playMenu.setJFrame(frame);

        frame.setContentPane(playMenu.getUIPanel());
        frame.setSize(300,500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式

    }
}
