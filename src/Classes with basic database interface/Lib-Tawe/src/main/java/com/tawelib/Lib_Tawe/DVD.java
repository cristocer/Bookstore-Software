/**
 * DVD.java
 * @author Ben Farrington
 * -no copyright
 * @version 1.1
 * Version History 1.1
 * Creation Date 17/11/2018
 * Last Modified date 22/11/2018
 */
package com.tawelib.Lib_Tawe;
import javax.persistence.*;
/**
 * DVD is a subclass of the class Resources, which holds the data and methods relevant to only
 * DVD and no other Resources subclasses. 
 * This class models the physical object of a DVD owned by TaweLib.
 */

@Entity//Defining the class as a persistent entity allowing the hibernate API to interact with it 
@PrimaryKeyJoinColumn(name="ResourceUID")//Defining that this entity's primary key is imported from another class, Resources
public class DVD extends Resources{

    private String director;
    private int runTime;
    private String language;
    private String subtitleLanguage;
    
    public DVD () {  //Default constructor for database stuff
    }
    
    
    /**
     * On creation initializes all required attributes.
     * @param director name of director.
     * @param runTime run time of  DVD in seconds.
     * @param language language of the DVD's audio
     * @param subtitleLanguage language of the DVD's subtitles.
     */
    public DVD(String director, int runTime, String language, String subtitleLanguage, String title, String year,	
               String thumbnailImagePath){

        this.director = director;
        this.runTime = runTime;
        this.language = language;
        this.subtitleLanguage = subtitleLanguage;
        this.title = title;
        this.year = year;
        this.thumbnailImagePath = thumbnailImagePath;
    }

    public void editResource(String director, int runTime, String language, String subtitleLanguage, String title, String year,	
            String thumbnailImagePath){
        this.director = director;
        this.runTime = runTime;
        this.language = language;
        this.subtitleLanguage = subtitleLanguage;
        this.title = title;
        this.year = year;
        this.thumbnailImagePath = thumbnailImagePath;
    }
    
    /**
     * Gets the director.
     * @return name of director.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Gets the DVD's runtime
     * @return runtime in seconds.
     */
    public int getRunTime() {
        return runTime;
    }

    /**
     * Gets the DVD's language.
     * @return audio language.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Gets the DVD's subtitle language.
     * @return subtitle language.
     */
    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }
}
