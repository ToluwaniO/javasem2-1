
/**
 * The class  <b>Statistics</b> accumulates the results of
 * the experiments. It know ahead of time how many experiments
 * will be run, and provides at the end the min, the max, the
 * average and the standard deviation for the data.
 *
 * <b> this class should not use classes such as Array,
 * Lists etc. </b> to store the data, only prinitive types
 * and java arrays.
 *
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
 import java.lang.Math;//Used for squareroot and power

public class Statistics {


// ADD HERE INSTANCE VARIABLES DECLARATION

  private int[] data;
  private int position;
  private int total;
  private int numberOfRuns;


	/**
     * Constructor.
     *
     * @param numberOfRuns the number of experiments that will be run
     */
 	public  Statistics(int numberOfRuns){

// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    data = new int[numberOfRuns];
    this.numberOfRuns = numberOfRuns;

	}

	/**
     * Updates statistics after one experiment.
     * This method cannot be called more times than the
     * paramter that was passed in the constructor. If
     * it is, an error message should be printed and
     * no change should occur.
     *   @param value the result of the new experiment
     */
	public void updateStatistics(int value){

    // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    if(position < numberOfRuns){
        data[position] = value;
        System.out.println("value: "+value);
        position++;}

	}

  public int getTotal(){
    int total = 0;

    for (int i : data) {
      total += i;
    }

    return total;
  }


	/**
     *   @return the current average of the values passed
     * to the method updateStatistic
     */
	public double average(){

    // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    // int total = 0;
    int len = data.length;
    double average;

    // for (int val : data) {
    //   total += val;
    // }

    average = getTotal()/len;

    //System.out.println("average" + average);

    return average;
	}


	/**
     *   @return the current standard deviation of the values passed
     * to the method updateStatistic
     */
	public double standardDeviation(){
    double sd=0;
    int len = data.length;
    double average = average();
    double standardDeviation;

    for(int i = 0; i < len; i++){
      sd += Math.pow((data[i]-average),2);
    }

    standardDeviation = Math.sqrt(sd/len);

    return standardDeviation;

	}

  public int getMin(){
    int min = data[0];

    for (int i : data) {
      if(min > i){
        min = i;
      }
    }

    return min;
  }

  public int getMax(){
    int max = data[0];

    for (int i : data) {
      if(max < i){
        max = i;
      }
    }

    return max;
  }

	/**
     *  @return Returns the complete statistics information:
     * current minimum, current maximim, current average and
     * current standard deviation. For the last two, only two
     * digits decimals are shown
     */
	public String toString(){

// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
  return "We have run " + data.length + " experiments.\nthe minimum was " + getMin() +
  "\nthe maximum was " + getMax() + "\nthe mean was " + average() + "\nthe standard deviation is " + standardDeviation();

	}

}
