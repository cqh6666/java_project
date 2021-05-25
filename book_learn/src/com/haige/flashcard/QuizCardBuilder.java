package book_learn.src.com.haige.flashcard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @className: book_learn.src.com.haige.flashcard-> QuizCardBuilder
 * @description: 设计并存储卡片的工具
 * @author: cqh
 * @createDate: 2021-05-25 13:02
 * @version: 1.0
 * @todo:
 */
public class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go(){
        //创建并显示gui
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();

        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");

        cardList = new ArrayList<QuizCard>();

        JLabel qLabel = new JLabel("Question:");
        JLabel aLabel = new JLabel("Answer:");

        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800, 300);
        frame.setVisible(true);

    }

    private class NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //向列表中增加当前卡片并清除文本域
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    private class SaveMenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //生成对话框 - 输入用户名并保存设置
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);

            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }

    private class NewMenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //清除card列表和文本域
            cardList.clear();
            clearCard();
        }
    }
    private void clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file){
        //把列表输出到一个文本文件上
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for ( QuizCard card:cardList){
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        }catch (IOException ex){
            System.out.println("couldn't write the cardList out");

        }
    }
}
