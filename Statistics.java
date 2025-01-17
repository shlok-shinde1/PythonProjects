/* Program Name: Statistics
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: The statistics class keeps track of integer values, calculating and outputting their sum, product, count, maximum, minimum, and average.
 */

 class Statistics {
    // Variables to store count, sum, product, maximum, and minimum of values added
    private int mNumValues;
    private int mSumOfValues;
    private int mProductOfValues;
    private int mMaximumValue;
    private int mMinimumValue;
 
    // Constructor initializes the variables to default values
    public Statistics() {
        mNumValues = 0;
        mSumOfValues = 0;
        mProductOfValues = 1;  // Initialize to 1 because of multiplication
        mMaximumValue = 0;  
        mMinimumValue = 0;  
    }
    
    // Returns the sum of all values added 
    public int getSum() {
        return mSumOfValues;
    }
 
    // Returns the number of values added 
    public int getNumValues() {
        return mNumValues;
    }
 
    // Returns the product of all values added 
    public int getProduct() {
        return mProductOfValues;
    }
 
    // Returns the smallest value added
    public int getMin() {
        return mMinimumValue;
    }
 
    // Returns the largest value added
    public int getMax() {
        return mMaximumValue;
    }
 
    // Adds a new value, updates count, sum, product, max, and min
    public void addValue(int val) {
        mNumValues++;
        mSumOfValues += val;
        mProductOfValues *= val;
        
        // Sets the max and min to the first value added; then adjust for later values
        if (mNumValues == 1) {
            mMaximumValue = val;
            mMinimumValue = val;
        } else {
            if (val > mMaximumValue) {
                mMaximumValue = val;
            } 
            if (val < mMinimumValue) {
                mMinimumValue = val;
            }
        }
    }
 
    // Returns the average of all values added and returns 0.0 if no values have been added to avoid multiplication by 0
    public double getAverage() {
        if (mNumValues > 0) {
            return (double) mSumOfValues / mNumValues;
        } else {
            return 0.0;
        }
    }
}