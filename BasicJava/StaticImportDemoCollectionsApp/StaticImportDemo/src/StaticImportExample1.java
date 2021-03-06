import static java.util.Collections.*;

/**
 * 
 * Example of Static import.
 *
 */
public class StaticImportExample1
{

	public static void main(String[] args)
	{

		// System.out.println("Empty List : " + Collections.EMPTY_LIST); // With out static import
		System.out.println("Empty List : " + EMPTY_LIST); // With static import

		// System.out.println("Empty Set : " + Collections.emptySet()); // With out static import
		System.out.println("Empty Set : " + emptySet()); // With static import

	}

}
