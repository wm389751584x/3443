package lab8;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileCounts {
    private File file;
    private Scanner input;
    private FileReader inputChar;
	private FileInputStream inputByte;
    
    public FileCounts(File file) {
        this.file = file;
        
    }
 
    public int lineCount() {
    	int count = 0;
    	
    	try {
            input = new Scanner(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    	
    	try{ 
    	   while(input.hasNextLine()){
    		   input.nextLine();
    		   count++;
    	   }
    	} catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
            System.exit(1);
        } finally {
            if (input != null)
                input.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    } // end method lineCount
    
    
    public int tokenCount() {
    	int count = 0;
    	
    	try {
            input = new Scanner(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    	
    	try{ 
    	   while(input.hasNext()){
    		   input.next();
    		   count++;
    	   }
    	} catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
            System.exit(1);
        } finally {
            if (input != null)
                input.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
    
    public int charCount() throws IOException {
    	int count = 0;
    	
    	try {
            inputChar = new FileReader(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    	
    	try{ 
     	   while(inputChar.read() != -1){
     		   count++;
     	   }
     	} catch (NoSuchElementException elementException) {
             System.err.println("File improperly formed.");
             inputChar.close();
             System.exit(1);
         } catch (IllegalStateException stateException) {
             System.err.println("Error reading from file.");
             System.exit(1);
         } 
    	finally {
            if (inputChar != null)
                inputChar.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
    
    public int byteCount() throws IOException {
    	int count = 0;
    	
    	try {
            inputByte = new FileInputStream(this.file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    	
    	try{ 
     	   while(inputByte.read() != -1){
     		   count++;
     	   }
     	} catch (NoSuchElementException elementException) {
             System.err.println("File improperly formed.");
             input.close();
             System.exit(1);
         } catch (IllegalStateException stateException) {
             System.err.println("Error reading from file.");
             System.exit(1);
         } 
    	finally {
            if (inputByte != null)
                inputByte.close(); // close the Scanner and the file
        } // end try-catchfinally
    	return count;
    }
}
