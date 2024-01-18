package basicstats;

import java.util.ArrayList;
import javax.swing.text.JTextComponent;

// Interface for use of template method.
public interface View {

  public void update(ArrayList<Integer> numbers);

  public void reset();

  public JTextComponent show();

  public String getName();
}
