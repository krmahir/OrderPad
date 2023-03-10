package Practical_8.searcherTest;

import Practical_8.searcher.IndexingError;
import Practical_8.searcher.Searcher;
import Practical_8.searcher.SimpleSearcher;

/**
 * @author Ilias Tachmazidis
 * @version September 2021
 */

class SimpleSearcherTest extends SearcherTest {

    protected Searcher createSearcher(int[] array, int index) throws IndexingError {
        return new SimpleSearcher(array,index);
    }

}