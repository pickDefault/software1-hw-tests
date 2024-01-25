import java.util.Arrays;

class testing {
        public static void main(String[] args) {
        }

        public static void testq4() {
                boolean res;
                res = StringUtils.isEditDistanceOne("dog","god");
		if ( res != false ) {
                        System.out.println("[Q4] Failed test 1");
                }
                res = StringUtils.isEditDistanceOne("x","x");
		if ( res != true ) {
                        System.out.println("[Q4] Failed test 2");
                }
                res = StringUtils.isEditDistanceOne("main","man");
		if ( res != true ) {
                        System.out.println("[Q4] Failed test 3");
                }
                res = StringUtils.isEditDistanceOne("ab","cab");
		if ( res != true ) {
                        System.out.println("[Q4] Failed test 4");
                }
                res = StringUtils.isEditDistanceOne("ab", "acb");
                if ( res != true ) {
                        System.out.println("[Q4] Failed test 5");
                }
                res = StringUtils.isEditDistanceOne("cat", "cult");
                if ( res != false ) {
                        System.out.println("[Q4] Failed test 6");
                }
        }
        public static void testq3() {
                String res;
                res = StringUtils.findSortedSequence("to be or not to be");
                if ( !res.equals("not to") ) {
                        System.out.println("[Q3] Failed test 1");
                }
                res = StringUtils.findSortedSequence("my mind is an empty zoo");
                if ( !res.equals("an empty zoo") ) {
                        System.out.println("[Q3] Failed test 2");
                }
                res = StringUtils.findSortedSequence("");
                if ( !res.equals("") ) {
                        System.out.println("[Q3] Failed test 3");
                }
                res = StringUtils.findSortedSequence("andy bought candy");
                if ( !res.equals("andy bought candy") ) {
                        System.out.println("[Q3] Failed test 4");
                }
                res = StringUtils.findSortedSequence("life is not not not fair");
                if ( !res.equals("is not not not") ) {
                        System.out.println("[Q3] Failed test 5");
                }
                res = StringUtils.findSortedSequence("art act");
                if ( !res.equals("act") ) {
                        System.out.println("[Q3] Failed test 6");
                }
        }
        public static void testq2() {
                int res;
                res = ArrayUtils.findShortestPath(new int[][]{{0,0,0},{0,0,0},{0,0,0}},0,1);
                if (res != -1) {
                        System.out.println("[Q2] Failed test 1");
                }
                res = ArrayUtils.findShortestPath(new int[][]{{0,0,0},{0,0,0},{0,0,0}},1,1);
                if ( res != 0) {
                        System.out.println("[Q2] Failed test 2");
                }
                res = ArrayUtils.findShortestPath(new int[][]{{0,1,0,0},{0,0,1,0},{0,0,0,1},{1,0,0,0}},0,2);
                if ( res != 2) {
                        System.out.println("[Q2] Failed test 3");
                }
                res = ArrayUtils.findShortestPath(new int[][]{{0,1,0,1},{0,0,0,1},{0,0,0,0},{0,0,1,0}},0,2);
                if ( res != 2) {
                        System.out.println("[Q2] Failed test 4");
                }
                res = ArrayUtils.findShortestPath(new int[][]{{0,1,0,0,0},{0,0,1,0,0},{0,1,0,1,1},{0,1,0,0,1},{0,0,0,0,0}},0,4);
                if ( res != 3) {
                        System.out.println("[Q2] Failed test 5");
                }
        }
        public static void testq1() {
                String[] results = new String[]{
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5},-1, 'R')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, -7, 'R')),
                Arrays.toString(ArrayUtils.shiftArrayCyclic(new int[]{}, 3, 'R'))
                };
                
                String[] expectedResults = new String[]{
                Arrays.toString(new int[]{2,3,4,5,1}),
                Arrays.toString(new int[]{5,1,2,3,4}),
                Arrays.toString(new int[]{1,2,3,4,5}),
                Arrays.toString(new int[]{1,2,3,4,5}),
                Arrays.toString(new int[]{4,5,1,2,3}),
                Arrays.toString(new int[]{3,4,5,1,2}),
                Arrays.toString(new int[]{8, 9, 5, 6,0}),
                Arrays.toString(new int[]{9, 5, 6, 0, 8}),
                "[]"
                };

                for(int i = 1; i < results.length; i++) {
                        if (!results[i].equals(expectedResults[i])) {
                                System.out.println(
                                        "[Q1] Failed test #\n" + i + "output: " + results[i] + ", expected output: " + expectedResults[i]
                                );
                        }
                }
        }
}