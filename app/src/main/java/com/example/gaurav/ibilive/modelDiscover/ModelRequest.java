package com.example.gaurav.ibilive.modelDiscover;

/**
 * Created by gaurav on 4/5/17.
 */

public class ModelRequest {
    private String name;
    private String address;
    private String review;
    private String duration;
    private float ratings;

    /**
     * @param name     : name
     * @param address  : address
     * @param review   : review
     * @param duration : duration
     * @param ratings  : ratings
     */
    public ModelRequest(final String name, final String address, final String review, final String duration
            , final float ratings) {
        this.name = name;
        this.address = address;
        this.review = review;
        this.duration = duration;
        this.ratings = ratings;
    }

    /**
     * Getter for name
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Getter for address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter for reveiw
     *
     * @return reveiw
     */
    public String getReview() {
        return review;
    }

    /**
     * Getter for duration
     *
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Getter for ratings
     *
     * @return ratings
     */
    public Float getRatings() {
        return ratings;
    }


}

