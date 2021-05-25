package book_learn.src.com.haige.flashcard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @className: book_learn.src.com.haige.flashcard-> QuizCardPlayer
 * @description: 加载并播放卡片的引擎
 * @author: cqh
 * @createDate: 2021-05-25 13:02
 * @version: 1.0
 * @todo:
 */
public class QuizCardPlayer {

    private JTextArea display;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) {
        QuizCardPlayer player = new QuizCardPlayer();
        player.go();
    }

    public void go(){
        //创建并显示gui
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();

        display = new JTextArea(10, 20);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nextButton = new JButton("Show Question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640, 500);
        frame.setVisible(true);

    }

    class NextCardListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // 如果是个问题，显示答案，否则显示下一个问题
            if (isShowAnswer){
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;
            }else{
                if (currentCardIndex < cardList.size()){
                    showNextCard();
                }else{
                    display.setText("no card");
                    nextButton.setEnabled(false);
                }
            }
        }
    }

    class OpenMenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //生成一个文件对话框 让用户把一个卡片设置打开
            JFileChooser fileopen = new JFileChooser();
            fileopen.showOpenDialog(frame);
            loadFile(fileopen.getSelectedFile());
        }
    }

    private void loadFile(File file){
        //创建卡片的ArrayList，从文本文件中读取它们
        // 调用openmenu事件处理器，每次从文件中读取一行
        // 告诉makeCard()方法创建一个新卡片
        cardList = new ArrayList<QuizCard>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while( (line = reader.readLine() ) != null){
                makeCard(line);
            }
            reader.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void makeCard(String lineToParse){
        //调用 loadFile方法
        // 创建一个新的QuizCard，调用CardList把它加入到ArrayList中
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("make a card");
    }

    private void showNextCard(){
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }


}
