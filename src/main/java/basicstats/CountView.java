package basicstats;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

// View for count of numbers
public class CountView implements View {

  int count;
  JTextField jtfCount;
  String name;

  public CountView() {
    count = 0;
    jtfCount = new JTextField(5);
    jtfCount.setEditable(false);
    name = "Numbers";
  }

  @Override
  public void update(ArrayList<Double> numbers) {
    count = numbers.size();

    jtfCount.setText("" + count);
  }

  @Override
  public void reset() {
    // TODO Auto-generated method stub
    jtfCount.setText("");
  }

  @Override
  public JTextComponent show() {
    // TODO Auto-generated method stub
    return jtfCount;
  }

  public String getName() {
    return name;
  }

  public int getCount() {
    return count;
  }
}
