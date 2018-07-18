# color-matching
Color Match using RTree for multidimensional search

This is a simple Netbeans project using Oracle Spatial API (which ahs an implementation of a RTree) to make multidimensional searches.

When executd, this program generates a RTree with 1 million random colors.

There two color matching operations in this program:

1 - Direct color matching

  Using the color chooser in the main panel, select one color and click the button "Find Match"
  The program will search for the best match within the RTree and display it
  The RGB representations of the target color and the best match are printed in the console

2 - File's average color matching

  Enter the full file name of the image file in the text box and click the button "Get File Average Color and find match"
  The program will calculate the file's average color, search for the best match within the RTree and display it
  The RGB representations of the target color and the best match are printed in the console
  
Unfortunately the documentation of this API is practically non-existent; I had to do some experimentation to find out how it works and the proper parameters to pass.
