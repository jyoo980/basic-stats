package basicstats.models;

import basicstats.views.View;
import java.util.ArrayList;

// Model for this assignment
public class Numbers implements Model {

  // Variables for Model
  ArrayList<Double> numbers;
  ArrayList<View> observers;

  public Numbers() {
    numbers = new ArrayList<Double>();
    observers = new ArrayList<View>();
  }

  @Override
  public void update(ArrayList<Double> information) {
    if (information.size() == 0) {
      numbers = information;
    } else {
      numbers.addAll(information);
    }

    updateViews();
  }

  public ArrayList<Double> getData() {
    return numbers;
  }

  public void addData(Double num) {
    numbers.add(num);

    updateViews();
  }

  public void updateViews() {

    for (View view : observers) {
      if (numbers.size() == 0) {
        view.reset();
      } else {
        view.update(numbers);
      }
    }
  }

  public void addObserver(View view) {
    observers.add(view);
  }
}