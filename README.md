I developed this IP tracker to acquire geographical information about a given IP address for use in a larger scale security application. It utilizes Selenium to gather information from ip-tracker.org.

Getting it up and running:
Note: The current chromedriver is for Mac. Download your version from http://chromedriver.storage.googleapis.com/index.html?path=2.14/ then replace the one in the IPTracker directory with your version.
  1. Clone the repo
  2. Import the repo into Eclipse
  3. Click Help then Eclipse Marketplace
  4. Search for and install TestNG
  3. Right click on the project, hover over Build Path, then click on Configure Build Path...
  4. Click Libraries
  5. Click Add External JARS...
  6. Navigate to the libs directory and select all of the .jar files
  7. Click Open
  9. Click Add Library...
  10. Select TestNG from the list then click Next and Finish
  8. Click Apply and Close
  9. Now run IPTracker.java and look for the details in the output!
