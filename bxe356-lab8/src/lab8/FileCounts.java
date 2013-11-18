package lab8;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * class to find the sizes of different attributes
 * @author myoder
 *
 */
public class FileCounts {
    private File file;
    private Scanner input;
    private FileReader inputChar;
	private FileInputStream inputByte;
    
    public FileCounts(File file) {
        this.file = file;
        
    }
 
    /**
     * counts the number lines in a file
     * @return
     */
    public int lineCount() {
    	int count = 0;
    	
    	try {
            input = new Scanner(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
        }
    	
    	try{ 
    	   while(input.hasNextLine()){
    		   input.nextLine();
    		   count++;
    	   }
    	} catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
        } finally {
            if (input != null)
                input.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    } // end method lineCount
    
    /**
     * counts the number of words in a file
     * @return
     */
    
    public int tokenCount() {
    	int count = 0;
    	
    	try {
            input = new Scanner(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
        }
    	
    	try{ 
    	   while(input.hasNext()){
    		   input.next();
    		   count++;
    	   }
    	} catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
        } finally {
            if (input != null)
                input.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
    
    /**
     * counts the number of characters in a file
     * @return
     * @throws IOException
     */
    public int charCount() throws IOException {
    	int count = 0;
    	
    	try {
            inputChar = new FileReader(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
        }
    	
    	try{ 
     	   while(inputChar.read() != -1){
     		   count++;
     	   }
     	} catch (NoSuchElementException elementException) {
             System.err.println("File improperly formed.");
             inputChar.close();
         } catch (IllegalStateException stateException) {
             System.err.println("Error reading from file.");
         } 
    	finally {
            if (inputChar != null)
                inputChar.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
    
    /**
     * counts the number of bytes in a file
     * @return
     * @throws IOException
     */
    public int byteCount() throws IOException {
    	int count = 0;
    	
    	try {
            inputByte = new FileInputStream(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
        }
    	
    	try{ 
     	   while(inputByte.read() != -1){
     		   count++;
     	   }
     	} catch (NoSuchElementException elementException) {
             System.err.println("File improperly formed.");
             input.close();
         } catch (IllegalStateException stateException) {
             System.err.println("Error reading from file.");
         } 
    	finally {
            if (inputByte != null)
                inputByte.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
}
