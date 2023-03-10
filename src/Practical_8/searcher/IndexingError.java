package Practical_8.searcher;

/**
 * Use to report index out of bounds errors
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 **/
public class IndexingError extends Exception
{
    /**
     * Used to report an index out of bounds error
     **/
    IndexingError() {
        super("Index k out of bounds");
    }
}

