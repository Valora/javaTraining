import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JOptionPane
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

/**
 * Created by valora on 2017/3/9.
 */
frame = new JFrame(size: [300, 300],
    layout: new FlowLayout(),
    defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)

button = new JButton("click")
postionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add button
frame.contentPane.add postionLabel
frame.contentPane.add msgLabel

button.addActionListener(
        {JOptionPane.showMessageDialog(frame, "you clicked!") } as ActionListener
)

displayMouseLocation = { postionLabel.setText("$it.x, $it.y")}
frame.addMouseListener( displayMouseLocation as MouseListener)
frame.addMouseMotionListener( displayMouseLocation as MouseMotionListener)

handleFocus = {
    focusGained: {msgLabel.setText('Good to see you!')}
    focusLost: { msgLabel.setText('Come back soon!')}
}

button.addFocusListener(handleFocus as FocusListener)
events = ['WindowListener','ComponentListener']
handler = { msgLabel.setText('$it')}
for (event in events) {
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}"(handlerImpl)
}

frame.show()