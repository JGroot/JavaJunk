import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class AudioFrame extends JFrame
{

   private JLabel credit;
   private JButton playButton;
   private JButton loopButton;
   private JButton stopButton;
   private AudioClip sound;
   
   public AudioFrame() throws MalformedURLException
   {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("JFrame Audio Demo");
      setLayout(new FlowLayout());
      credit = new JLabel("Audio source: song:");
      add(credit);
      makeButtons();
      File file = new File("Mazzy");
      URI uri = file.toURI();
      URL url = uri.toURL();
      
      sound = Applet.newAudioClip(url);
      pack();
      setVisible(true);
   }
   
    private void makeButtons()
   {
      playButton = new JButton("Play");
      loopButton = new JButton("Loop");
      stopButton = new JButton("Stop");
      
      playButton.addActionListener(new ButtonListener());
      loopButton.addActionListener(new ButtonListener());
      stopButton.addActionListener(new ButtonListener());
      
      add(playButton);
      add(loopButton);
      add(stopButton);
   }
   
    private class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == playButton)
            sound.play();
         else if (e.getSource() == loopButton)
            sound.loop();
         else if (e.getSource() == stopButton)
            sound.stop();
      }
  }

  public static void main(String[] args) throws MalformedURLException
  {
   new AudioFrame();
  }
}