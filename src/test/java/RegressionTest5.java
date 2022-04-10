import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(100);
        aVLTree0.insert((int) (byte) -1);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AVLTree.Node node8 = aVLTree0.find((int) '#');
        AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        aVLTree0.delete(0);
        AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.delete(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree.Node node9 = aVLTree0.find(0);
        int int10 = aVLTree0.height();
        AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        AVLTree.Node node13 = aVLTree0.getRoot();
        AVLTree.Node node15 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        AVLTree.Node node14 = aVLTree0.getRoot();
        AVLTree.Node node16 = aVLTree0.find(0);
        AVLTree.Node node17 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        int int16 = aVLTree0.height();
        AVLTree.Node node17 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass18 = node17.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AVLTree aVLTree6 = new AVLTree();
        AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) (byte) 10);
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = null;
        int int36 = aVLTree32.getBalance(node35);
        aVLTree32.insert((int) (short) 100);
        AVLTree.Node node40 = aVLTree32.find((int) ' ');
        int int41 = aVLTree32.height();
        AVLTree.Node node42 = aVLTree32.getRoot();
        AVLTree aVLTree43 = new AVLTree();
        AVLTree.Node node45 = aVLTree43.find((int) '4');
        AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        AVLTree.Node node51 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        int int54 = aVLTree43.height();
        aVLTree43.delete((int) (byte) 0);
        AVLTree.Node node58 = aVLTree43.find(0);
        int int59 = aVLTree43.height();
        AVLTree.Node node61 = aVLTree43.find((int) (short) 10);
        int int62 = aVLTree32.getBalance(node61);
        int int63 = aVLTree0.getBalance(node61);
        AVLTree aVLTree64 = new AVLTree();
        AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        AVLTree aVLTree67 = new AVLTree();
        AVLTree.Node node69 = aVLTree67.find((int) '4');
        AVLTree.Node node70 = null;
        int int71 = aVLTree67.getBalance(node70);
        aVLTree67.insert((int) (short) 100);
        AVLTree.Node node75 = aVLTree67.find((int) ' ');
        int int76 = aVLTree67.height();
        AVLTree.Node node77 = aVLTree67.getRoot();
        int int78 = aVLTree64.getBalance(node77);
        int int79 = aVLTree64.height();
        AVLTree.Node node80 = aVLTree64.getRoot();
        AVLTree aVLTree81 = new AVLTree();
        AVLTree.Node node83 = aVLTree81.find((int) '4');
        AVLTree.Node node85 = aVLTree81.find((int) 'a');
        aVLTree81.insert((int) (short) -1);
        AVLTree.Node node88 = aVLTree81.getRoot();
        int int89 = aVLTree64.getBalance(node88);
        int int90 = aVLTree0.getBalance(node88);
        AVLTree.Node node92 = aVLTree0.find(10);
        int int93 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 0);
        AVLTree.Node node33 = aVLTree0.find(0);
        AVLTree.Node node34 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        AVLTree aVLTree37 = new AVLTree();
        AVLTree.Node node39 = aVLTree37.find((int) '4');
        AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        AVLTree.Node node45 = aVLTree37.getRoot();
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        aVLTree37.insert((int) (byte) -1);
        AVLTree.Node node52 = aVLTree37.find((int) (short) -1);
        int int53 = aVLTree0.getBalance(node52);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert(0);
        aVLTree10.insert((int) (short) 10);
        AVLTree.Node node19 = aVLTree10.getRoot();
        AVLTree aVLTree20 = new AVLTree();
        AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        AVLTree aVLTree29 = new AVLTree();
        AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        AVLTree aVLTree40 = new AVLTree();
        AVLTree.Node node42 = aVLTree40.find((int) '4');
        AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        AVLTree.Node node53 = aVLTree10.find((int) (byte) -1);
        AVLTree.Node node55 = aVLTree10.find((int) (byte) -1);
        aVLTree10.insert((int) '#');
        AVLTree.Node node59 = aVLTree10.find((int) (byte) 10);
        AVLTree.Node node60 = aVLTree10.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        AVLTree.Node node15 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AVLTree aVLTree5 = new AVLTree();
        AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        AVLTree.Node node21 = aVLTree0.find((int) (byte) -1);
        AVLTree aVLTree22 = new AVLTree();
        AVLTree.Node node24 = aVLTree22.find((-1));
        aVLTree22.delete(100);
        aVLTree22.insert((int) (short) 1);
        AVLTree.Node node29 = aVLTree22.getRoot();
        AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree0.getBalance(node30);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        int int8 = aVLTree0.height();
        AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        AVLTree.Node node19 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AVLTree aVLTree6 = new AVLTree();
        AVLTree.Node node8 = aVLTree6.find((int) '4');
        AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        AVLTree.Node node14 = aVLTree6.getRoot();
        AVLTree aVLTree15 = new AVLTree();
        AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AVLTree.Node node20 = aVLTree15.getRoot();
        AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        AVLTree.Node node24 = aVLTree15.find((int) ' ');
        AVLTree aVLTree25 = new AVLTree();
        AVLTree.Node node27 = aVLTree25.find((int) '4');
        AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        AVLTree.Node node45 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        AVLTree aVLTree18 = new AVLTree();
        AVLTree.Node node20 = aVLTree18.find((int) '4');
        AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        AVLTree aVLTree28 = new AVLTree();
        AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AVLTree aVLTree39 = new AVLTree();
        AVLTree.Node node41 = aVLTree39.find((int) '4');
        AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete(0);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        AVLTree.Node node13 = aVLTree7.find(100);
        AVLTree aVLTree14 = new AVLTree();
        AVLTree.Node node16 = aVLTree14.find((int) '4');
        AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        aVLTree0.delete(10);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node9 = aVLTree7.find((int) '4');
        AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AVLTree.Node node43 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass48 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        aVLTree11.delete(1);
        aVLTree11.delete((int) '#');
        AVLTree.Node node20 = null;
        int int21 = aVLTree11.getBalance(node20);
        AVLTree.Node node22 = aVLTree11.getRoot();
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node25 = aVLTree23.find((int) '4');
        AVLTree.Node node27 = aVLTree23.find((int) 'a');
        int int28 = aVLTree23.height();
        AVLTree aVLTree29 = new AVLTree();
        AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.insert((int) (byte) 100);
        AVLTree aVLTree35 = new AVLTree();
        AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        AVLTree aVLTree46 = new AVLTree();
        AVLTree.Node node48 = aVLTree46.find((int) '4');
        AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree29.getBalance(node54);
        int int57 = aVLTree23.getBalance(node54);
        int int58 = aVLTree11.getBalance(node54);
        aVLTree11.insert((int) (short) -1);
        AVLTree.Node node62 = aVLTree11.find((int) (short) 0);
        AVLTree.Node node63 = aVLTree11.getRoot();
        int int64 = aVLTree0.getBalance(node63);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        AVLTree.Node node13 = aVLTree7.find(100);
        AVLTree aVLTree14 = new AVLTree();
        AVLTree.Node node16 = aVLTree14.find((int) '4');
        AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        aVLTree0.delete(10);
        AVLTree aVLTree28 = new AVLTree();
        AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AVLTree aVLTree39 = new AVLTree();
        AVLTree.Node node41 = aVLTree39.find((int) '4');
        AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        aVLTree28.insert(0);
        int int51 = aVLTree28.height();
        AVLTree.Node node52 = aVLTree28.getRoot();
        int int53 = aVLTree0.getBalance(node52);
        int int54 = aVLTree0.height();
        AVLTree.Node node55 = aVLTree0.getRoot();
        AVLTree.Node node57 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        AVLTree.Node node11 = aVLTree0.find(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node4 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        AVLTree.Node node10 = aVLTree0.getRoot();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert(0);
        aVLTree11.insert((int) (short) 10);
        AVLTree.Node node20 = aVLTree11.getRoot();
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.insert((int) (byte) 100);
        aVLTree21.insert((int) 'a');
        AVLTree.Node node29 = aVLTree21.find((int) (byte) 100);
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        AVLTree aVLTree41 = new AVLTree();
        AVLTree.Node node43 = aVLTree41.find((int) '4');
        AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree21.getBalance(node49);
        int int52 = aVLTree11.getBalance(node49);
        int int53 = aVLTree11.height();
        AVLTree.Node node54 = aVLTree11.getRoot();
        int int55 = aVLTree0.getBalance(node54);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.insert((int) ' ');
        AVLTree.Node node48 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) '#');
        int int51 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        AVLTree.Node node55 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AVLTree.Node node28 = aVLTree0.getRoot();
        int int29 = aVLTree0.height();
        AVLTree.Node node30 = aVLTree0.getRoot();
        AVLTree.Node node31 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        AVLTree.Node node16 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AVLTree aVLTree6 = new AVLTree();
        AVLTree.Node node8 = aVLTree6.find((int) '4');
        AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        AVLTree aVLTree13 = new AVLTree();
        AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        AVLTree.Node node24 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AVLTree.Node node43 = aVLTree0.getRoot();
        AVLTree.Node node44 = aVLTree0.getRoot();
        AVLTree.Node node45 = aVLTree0.getRoot();
        AVLTree.Node node47 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) ' ');
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        AVLTree aVLTree8 = new AVLTree();
        AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        AVLTree.Node node14 = aVLTree8.find(100);
        AVLTree aVLTree15 = new AVLTree();
        AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        AVLTree aVLTree26 = new AVLTree();
        AVLTree.Node node28 = aVLTree26.find((int) '4');
        AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        AVLTree aVLTree36 = new AVLTree();
        AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node49 = aVLTree47.find((int) '4');
        AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        AVLTree.Node node62 = null;
        int int63 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node66 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AVLTree.Node node43 = aVLTree0.getRoot();
        AVLTree.Node node44 = aVLTree0.getRoot();
        AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        int int47 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        AVLTree.Node node50 = aVLTree0.getRoot();
        AVLTree aVLTree51 = new AVLTree();
        AVLTree.Node node53 = aVLTree51.find((int) '4');
        AVLTree.Node node54 = aVLTree51.getRoot();
        aVLTree51.delete(100);
        aVLTree51.insert((int) (byte) 10);
        AVLTree.Node node59 = aVLTree51.getRoot();
        AVLTree.Node node61 = aVLTree51.find((int) (byte) 0);
        AVLTree.Node node63 = aVLTree51.find((int) (short) 1);
        aVLTree51.insert(0);
        AVLTree.Node node67 = aVLTree51.find((int) (byte) 0);
        int int68 = aVLTree0.getBalance(node67);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert(0);
        AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) 100);
        AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete(0);
        AVLTree aVLTree15 = new AVLTree();
        AVLTree.Node node17 = aVLTree15.find((int) '4');
        AVLTree.Node node18 = aVLTree15.getRoot();
        AVLTree.Node node20 = aVLTree15.find((int) (short) -1);
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        AVLTree.Node node25 = aVLTree21.find((int) 'a');
        AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete((int) (short) 10);
        AVLTree.Node node29 = aVLTree21.getRoot();
        AVLTree.Node node30 = aVLTree21.getRoot();
        aVLTree21.insert((int) (byte) 100);
        AVLTree.Node node33 = aVLTree21.getRoot();
        int int34 = aVLTree15.getBalance(node33);
        int int35 = aVLTree0.getBalance(node33);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        AVLTree.Node node13 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        AVLTree.Node node16 = aVLTree11.getRoot();
        AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        AVLTree.Node node20 = aVLTree11.find((int) ' ');
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        AVLTree aVLTree28 = new AVLTree();
        AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        AVLTree.Node node40 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        AVLTree.Node node43 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        AVLTree.Node node17 = aVLTree0.getRoot();
        AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node21 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass24 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        AVLTree aVLTree13 = new AVLTree();
        AVLTree.Node node15 = aVLTree13.find((int) '4');
        int int16 = aVLTree13.height();
        aVLTree13.insert((-1));
        aVLTree13.delete((int) (byte) 1);
        AVLTree aVLTree21 = new AVLTree();
        aVLTree21.delete((int) (byte) -1);
        aVLTree21.delete((int) (byte) 0);
        AVLTree.Node node26 = aVLTree21.getRoot();
        AVLTree.Node node28 = aVLTree21.find(1);
        AVLTree.Node node30 = aVLTree21.find(10);
        AVLTree aVLTree31 = new AVLTree();
        AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) (byte) -1);
        int int36 = aVLTree31.height();
        int int37 = aVLTree31.height();
        AVLTree.Node node39 = aVLTree31.find((int) '#');
        AVLTree aVLTree40 = new AVLTree();
        AVLTree.Node node42 = aVLTree40.find((int) '4');
        AVLTree.Node node44 = aVLTree40.find((int) 'a');
        aVLTree40.delete((int) (short) 10);
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.insert((int) 'a');
        AVLTree.Node node55 = aVLTree47.find((int) (byte) 100);
        int int56 = aVLTree40.getBalance(node55);
        int int57 = aVLTree31.getBalance(node55);
        int int58 = aVLTree21.getBalance(node55);
        int int59 = aVLTree13.getBalance(node55);
        int int60 = aVLTree0.getBalance(node55);
        java.lang.Class<?> wildcardClass61 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        int int11 = aVLTree0.height();
        AVLTree aVLTree12 = new AVLTree();
        AVLTree.Node node14 = aVLTree12.find((int) '4');
        AVLTree.Node node15 = aVLTree12.getRoot();
        aVLTree12.delete(100);
        aVLTree12.delete((int) (short) -1);
        AVLTree aVLTree20 = new AVLTree();
        AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.insert((int) (short) 0);
        AVLTree.Node node26 = aVLTree20.find(100);
        AVLTree aVLTree27 = new AVLTree();
        AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        AVLTree aVLTree38 = new AVLTree();
        AVLTree.Node node40 = aVLTree38.find((int) '4');
        AVLTree.Node node41 = aVLTree38.getRoot();
        aVLTree38.delete(100);
        aVLTree38.insert((int) (byte) 10);
        AVLTree.Node node46 = aVLTree38.getRoot();
        int int47 = aVLTree27.getBalance(node46);
        AVLTree aVLTree48 = new AVLTree();
        AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        AVLTree.Node node53 = aVLTree48.getRoot();
        aVLTree48.delete(0);
        AVLTree.Node node56 = null;
        int int57 = aVLTree48.getBalance(node56);
        int int58 = aVLTree48.height();
        AVLTree aVLTree59 = new AVLTree();
        AVLTree.Node node61 = aVLTree59.find((int) '4');
        AVLTree.Node node62 = aVLTree59.getRoot();
        aVLTree59.delete(100);
        aVLTree59.insert((int) (byte) 10);
        AVLTree.Node node67 = aVLTree59.getRoot();
        int int68 = aVLTree48.getBalance(node67);
        int int69 = aVLTree27.getBalance(node67);
        int int70 = aVLTree20.getBalance(node67);
        int int71 = aVLTree12.getBalance(node67);
        aVLTree12.insert(1);
        int int74 = aVLTree12.height();
        AVLTree.Node node75 = aVLTree12.getRoot();
        int int76 = aVLTree0.getBalance(node75);
        aVLTree0.insert((int) (short) 100);
        aVLTree0.delete((int) ' ');
        int int81 = aVLTree0.height();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        AVLTree.Node node12 = aVLTree0.getRoot();
        AVLTree.Node node14 = aVLTree0.find(100);
        aVLTree0.delete(10);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) (byte) -1);
        int int22 = aVLTree17.height();
        int int23 = aVLTree17.height();
        AVLTree.Node node25 = aVLTree17.find((int) '#');
        AVLTree.Node node26 = aVLTree17.getRoot();
        aVLTree17.insert(0);
        AVLTree.Node node30 = aVLTree17.find((int) (byte) 0);
        int int31 = aVLTree0.getBalance(node30);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        aVLTree0.insert(0);
        AVLTree.Node node24 = aVLTree0.find(0);
        AVLTree.Node node26 = aVLTree0.find(100);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node14 = aVLTree0.find((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AVLTree aVLTree3 = new AVLTree();
        AVLTree.Node node5 = aVLTree3.find((int) '4');
        AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        AVLTree.Node node23 = aVLTree0.find((int) 'a');
        AVLTree aVLTree24 = new AVLTree();
        AVLTree.Node node26 = aVLTree24.find((int) '4');
        AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        AVLTree.Node node33 = aVLTree24.getRoot();
        AVLTree aVLTree34 = new AVLTree();
        AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        AVLTree aVLTree43 = new AVLTree();
        AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        AVLTree aVLTree54 = new AVLTree();
        AVLTree.Node node56 = aVLTree54.find((int) '4');
        AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        int int73 = aVLTree0.height();
        AVLTree.Node node74 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.find(1);
        AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        int int5 = aVLTree0.height();
        AVLTree.Node node7 = aVLTree0.find((-1));
        AVLTree aVLTree8 = new AVLTree();
        AVLTree.Node node10 = aVLTree8.find((int) '4');
        AVLTree.Node node12 = aVLTree8.find((int) 'a');
        aVLTree8.delete((int) (short) 10);
        int int15 = aVLTree8.height();
        aVLTree8.delete((int) '#');
        aVLTree8.delete((int) (short) -1);
        AVLTree aVLTree20 = new AVLTree();
        AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        AVLTree.Node node25 = aVLTree20.getRoot();
        AVLTree.Node node26 = null;
        int int27 = aVLTree20.getBalance(node26);
        AVLTree.Node node29 = aVLTree20.find((int) ' ');
        aVLTree20.insert((-1));
        AVLTree.Node node32 = aVLTree20.getRoot();
        aVLTree20.delete((int) (byte) -1);
        aVLTree20.insert(0);
        AVLTree aVLTree37 = new AVLTree();
        AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        AVLTree aVLTree46 = new AVLTree();
        AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        AVLTree aVLTree57 = new AVLTree();
        AVLTree.Node node59 = aVLTree57.find((int) '4');
        AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree37.getBalance(node65);
        AVLTree.Node node68 = aVLTree37.getRoot();
        AVLTree.Node node69 = aVLTree37.getRoot();
        int int70 = aVLTree20.getBalance(node69);
        AVLTree.Node node71 = aVLTree20.getRoot();
        int int72 = aVLTree8.getBalance(node71);
        int int73 = aVLTree0.getBalance(node71);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        aVLTree0.insert(1);
        int int6 = aVLTree0.height();
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AVLTree aVLTree14 = new AVLTree();
        AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        AVLTree.Node node22 = aVLTree14.find((int) (byte) 100);
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        AVLTree aVLTree34 = new AVLTree();
        AVLTree.Node node36 = aVLTree34.find((int) '4');
        AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        int int44 = aVLTree14.getBalance(node42);
        AVLTree.Node node45 = aVLTree14.getRoot();
        AVLTree.Node node46 = aVLTree14.getRoot();
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        AVLTree aVLTree59 = new AVLTree();
        AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        AVLTree.Node node64 = aVLTree59.getRoot();
        AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        AVLTree.Node node68 = aVLTree59.find((int) ' ');
        AVLTree aVLTree69 = new AVLTree();
        AVLTree.Node node71 = aVLTree69.find((int) '4');
        AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        AVLTree aVLTree76 = new AVLTree();
        AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree14.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        aVLTree0.insert((int) '#');
        java.lang.Class<?> wildcardClass93 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        AVLTree aVLTree13 = new AVLTree();
        AVLTree.Node node15 = aVLTree13.find((int) '4');
        AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node25 = aVLTree23.find((int) '4');
        AVLTree.Node node27 = aVLTree23.find((int) 'a');
        AVLTree.Node node29 = aVLTree23.find((int) ' ');
        AVLTree.Node node31 = aVLTree23.find(0);
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        aVLTree32.delete(1);
        aVLTree32.delete((int) '#');
        aVLTree32.delete((int) (short) -1);
        AVLTree.Node node43 = aVLTree32.getRoot();
        AVLTree.Node node45 = aVLTree32.find((int) (byte) 100);
        int int46 = aVLTree32.height();
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node49 = aVLTree47.find((int) '4');
        AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        AVLTree aVLTree53 = new AVLTree();
        AVLTree.Node node55 = aVLTree53.find((int) '4');
        AVLTree.Node node57 = aVLTree53.find((int) 'a');
        aVLTree53.delete((int) (short) 10);
        AVLTree aVLTree60 = new AVLTree();
        AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.insert((int) (byte) 100);
        aVLTree60.insert((int) 'a');
        AVLTree.Node node68 = aVLTree60.find((int) (byte) 100);
        int int69 = aVLTree53.getBalance(node68);
        int int70 = aVLTree47.getBalance(node68);
        int int71 = aVLTree32.getBalance(node68);
        int int72 = aVLTree23.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        int int74 = aVLTree0.height();
        int int75 = aVLTree0.height();
        java.lang.Class<?> wildcardClass76 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert((int) (short) 1);
        int int44 = aVLTree0.height();
        AVLTree aVLTree45 = new AVLTree();
        AVLTree.Node node47 = aVLTree45.find((int) '4');
        AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        AVLTree.Node node50 = aVLTree45.getRoot();
        AVLTree aVLTree51 = new AVLTree();
        AVLTree.Node node53 = aVLTree51.find((int) '4');
        AVLTree.Node node54 = aVLTree51.getRoot();
        aVLTree51.delete(100);
        int int57 = aVLTree51.height();
        AVLTree.Node node59 = aVLTree51.find((int) (short) -1);
        AVLTree.Node node60 = aVLTree51.getRoot();
        AVLTree.Node node61 = aVLTree51.getRoot();
        aVLTree51.insert((int) (byte) 1);
        AVLTree.Node node64 = aVLTree51.getRoot();
        int int65 = aVLTree45.getBalance(node64);
        int int66 = aVLTree0.getBalance(node64);
        java.lang.Class<?> wildcardClass67 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        AVLTree.Node node10 = aVLTree0.find(100);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AVLTree.Node node8 = aVLTree0.find(0);
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        AVLTree.Node node20 = aVLTree9.getRoot();
        AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        AVLTree aVLTree24 = new AVLTree();
        AVLTree.Node node26 = aVLTree24.find((int) '4');
        AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        AVLTree aVLTree37 = new AVLTree();
        AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        AVLTree.Node node50 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.delete(100);
        AVLTree.Node node56 = aVLTree0.find(0);
        int int57 = aVLTree0.height();
        AVLTree.Node node58 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        AVLTree.Node node3 = aVLTree0.getRoot();
        AVLTree aVLTree4 = new AVLTree();
        AVLTree.Node node6 = aVLTree4.find((int) '4');
        AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        AVLTree.Node node16 = aVLTree0.getRoot();
        AVLTree.Node node18 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        AVLTree.Node node4 = aVLTree0.find((int) (short) 1);
        AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((-1));
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((-1));
        AVLTree.Node node13 = aVLTree10.getRoot();
        AVLTree aVLTree14 = new AVLTree();
        AVLTree.Node node16 = aVLTree14.find((int) '4');
        AVLTree.Node node18 = aVLTree14.find((int) 'a');
        aVLTree14.insert((int) (short) -1);
        int int21 = aVLTree14.height();
        AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree10.getBalance(node22);
        aVLTree10.insert((int) (short) -1);
        AVLTree.Node node27 = aVLTree10.find((int) 'a');
        AVLTree.Node node28 = aVLTree10.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        int int30 = aVLTree0.height();
        AVLTree.Node node32 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        AVLTree aVLTree18 = new AVLTree();
        AVLTree.Node node20 = aVLTree18.find((int) '4');
        AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        int int30 = aVLTree0.height();
        AVLTree.Node node32 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        int int48 = aVLTree0.height();
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        AVLTree aVLTree14 = new AVLTree();
        AVLTree.Node node16 = aVLTree14.find((int) '4');
        AVLTree.Node node18 = aVLTree14.find((int) 'a');
        AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete((int) (short) 10);
        AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree14.height();
        int int24 = aVLTree14.height();
        AVLTree.Node node26 = aVLTree14.find(10);
        aVLTree14.insert(0);
        AVLTree aVLTree29 = new AVLTree();
        AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        aVLTree29.delete(1);
        AVLTree.Node node36 = aVLTree29.getRoot();
        AVLTree.Node node38 = aVLTree29.find((int) (byte) 10);
        AVLTree.Node node39 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        aVLTree29.insert((int) (short) 1);
        AVLTree.Node node44 = aVLTree29.getRoot();
        AVLTree.Node node45 = aVLTree29.getRoot();
        int int46 = aVLTree14.getBalance(node45);
        int int47 = aVLTree0.getBalance(node45);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        AVLTree aVLTree13 = new AVLTree();
        AVLTree.Node node15 = aVLTree13.find((int) '4');
        AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) '4');
        AVLTree.Node node21 = aVLTree13.find((int) '#');
        aVLTree13.insert(0);
        AVLTree aVLTree24 = new AVLTree();
        AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        AVLTree.Node node29 = aVLTree24.getRoot();
        AVLTree.Node node30 = null;
        int int31 = aVLTree24.getBalance(node30);
        AVLTree.Node node33 = aVLTree24.find((int) ' ');
        AVLTree aVLTree34 = new AVLTree();
        AVLTree.Node node36 = aVLTree34.find((int) '4');
        AVLTree.Node node38 = aVLTree34.find((int) 'a');
        aVLTree34.delete((int) (short) 10);
        AVLTree aVLTree41 = new AVLTree();
        AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.insert((int) (byte) 100);
        aVLTree41.insert((int) 'a');
        AVLTree.Node node49 = aVLTree41.find((int) (byte) 100);
        int int50 = aVLTree34.getBalance(node49);
        int int51 = aVLTree24.getBalance(node49);
        int int52 = aVLTree13.getBalance(node49);
        int int53 = aVLTree0.getBalance(node49);
        aVLTree0.insert(10);
        aVLTree0.delete(0);
        AVLTree aVLTree58 = new AVLTree();
        AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        AVLTree aVLTree61 = new AVLTree();
        AVLTree.Node node63 = aVLTree61.find((int) '4');
        AVLTree.Node node64 = null;
        int int65 = aVLTree61.getBalance(node64);
        aVLTree61.insert((int) (short) 100);
        AVLTree.Node node69 = aVLTree61.find((int) ' ');
        int int70 = aVLTree61.height();
        AVLTree.Node node71 = aVLTree61.getRoot();
        int int72 = aVLTree58.getBalance(node71);
        int int73 = aVLTree58.height();
        AVLTree.Node node75 = aVLTree58.find((int) (short) 0);
        int int76 = aVLTree58.height();
        AVLTree aVLTree77 = new AVLTree();
        AVLTree.Node node79 = aVLTree77.find((int) '4');
        AVLTree.Node node80 = aVLTree77.getRoot();
        aVLTree77.delete(100);
        int int83 = aVLTree77.height();
        AVLTree.Node node85 = aVLTree77.find((int) (short) -1);
        AVLTree.Node node86 = aVLTree77.getRoot();
        AVLTree.Node node87 = aVLTree77.getRoot();
        aVLTree77.insert((int) (byte) 1);
        int int90 = aVLTree77.height();
        AVLTree.Node node91 = aVLTree77.getRoot();
        int int92 = aVLTree58.getBalance(node91);
        int int93 = aVLTree0.getBalance(node91);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        AVLTree.Node node11 = aVLTree0.getRoot();
        AVLTree.Node node13 = aVLTree0.find(2);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        AVLTree.Node node14 = aVLTree0.getRoot();
        AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        AVLTree.Node node17 = aVLTree0.getRoot();
        AVLTree.Node node19 = aVLTree0.find(10);
        AVLTree.Node node21 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        AVLTree.Node node10 = aVLTree0.getRoot();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) '4');
        AVLTree.Node node19 = aVLTree11.find(100);
        aVLTree11.delete((int) (short) -1);
        int int22 = aVLTree11.height();
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node25 = aVLTree23.find((int) '4');
        AVLTree.Node node26 = null;
        int int27 = aVLTree23.getBalance(node26);
        aVLTree23.insert((int) '4');
        AVLTree.Node node31 = aVLTree23.find(100);
        AVLTree.Node node32 = aVLTree23.getRoot();
        AVLTree aVLTree33 = new AVLTree();
        AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        AVLTree aVLTree44 = new AVLTree();
        AVLTree.Node node46 = aVLTree44.find((int) '4');
        AVLTree.Node node47 = aVLTree44.getRoot();
        aVLTree44.delete(100);
        aVLTree44.insert((int) (byte) 10);
        AVLTree.Node node52 = aVLTree44.getRoot();
        int int53 = aVLTree33.getBalance(node52);
        AVLTree aVLTree54 = new AVLTree();
        AVLTree.Node node56 = aVLTree54.find((int) '4');
        aVLTree54.delete((int) 'a');
        AVLTree.Node node59 = aVLTree54.getRoot();
        aVLTree54.delete(0);
        AVLTree.Node node62 = null;
        int int63 = aVLTree54.getBalance(node62);
        int int64 = aVLTree54.height();
        AVLTree aVLTree65 = new AVLTree();
        AVLTree.Node node67 = aVLTree65.find((int) '4');
        AVLTree.Node node68 = aVLTree65.getRoot();
        aVLTree65.delete(100);
        aVLTree65.insert((int) (byte) 10);
        AVLTree.Node node73 = aVLTree65.getRoot();
        int int74 = aVLTree54.getBalance(node73);
        int int75 = aVLTree33.getBalance(node73);
        int int76 = aVLTree23.getBalance(node73);
        aVLTree23.insert(100);
        AVLTree.Node node79 = aVLTree23.getRoot();
        int int80 = aVLTree11.getBalance(node79);
        int int81 = aVLTree0.getBalance(node79);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert((int) (byte) -1);
        AVLTree.Node node51 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        AVLTree.Node node3 = aVLTree0.getRoot();
        AVLTree aVLTree4 = new AVLTree();
        AVLTree.Node node6 = aVLTree4.find((int) '4');
        AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        AVLTree.Node node17 = aVLTree0.find((int) 'a');
        AVLTree aVLTree18 = new AVLTree();
        AVLTree.Node node20 = aVLTree18.find((int) '4');
        aVLTree18.delete((int) 'a');
        aVLTree18.delete(1);
        aVLTree18.delete((int) '#');
        aVLTree18.delete((int) (short) -1);
        AVLTree.Node node29 = aVLTree18.getRoot();
        aVLTree18.insert(10);
        aVLTree18.delete(1);
        AVLTree.Node node34 = aVLTree18.getRoot();
        int int35 = aVLTree0.getBalance(node34);
        AVLTree.Node node37 = aVLTree0.find((int) ' ');
        int int38 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AVLTree.Node node13 = aVLTree0.getRoot();
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AVLTree.Node node8 = aVLTree0.find((int) '#');
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        int int22 = aVLTree0.height();
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node25 = aVLTree23.find((int) '4');
        int int26 = aVLTree23.height();
        AVLTree aVLTree27 = new AVLTree();
        AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.insert((int) (short) 1);
        AVLTree aVLTree35 = new AVLTree();
        AVLTree.Node node37 = aVLTree35.find((-1));
        int int38 = aVLTree35.height();
        AVLTree.Node node39 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        aVLTree35.delete(100);
        AVLTree aVLTree44 = new AVLTree();
        AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        AVLTree.Node node54 = null;
        int int55 = aVLTree44.getBalance(node54);
        AVLTree aVLTree56 = new AVLTree();
        AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        AVLTree.Node node61 = aVLTree56.getRoot();
        AVLTree.Node node62 = null;
        int int63 = aVLTree56.getBalance(node62);
        AVLTree.Node node65 = aVLTree56.find((int) ' ');
        AVLTree aVLTree66 = new AVLTree();
        AVLTree.Node node68 = aVLTree66.find((int) '4');
        AVLTree.Node node70 = aVLTree66.find((int) 'a');
        aVLTree66.delete((int) (short) 10);
        AVLTree aVLTree73 = new AVLTree();
        AVLTree.Node node74 = null;
        int int75 = aVLTree73.getBalance(node74);
        aVLTree73.insert((int) (byte) 100);
        aVLTree73.insert((int) 'a');
        AVLTree.Node node81 = aVLTree73.find((int) (byte) 100);
        int int82 = aVLTree66.getBalance(node81);
        int int83 = aVLTree56.getBalance(node81);
        int int84 = aVLTree44.getBalance(node81);
        int int85 = aVLTree35.getBalance(node81);
        int int86 = aVLTree27.getBalance(node81);
        int int87 = aVLTree23.getBalance(node81);
        int int88 = aVLTree0.getBalance(node81);
        java.lang.Class<?> wildcardClass89 = node81.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((-1));
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node19 = aVLTree17.find((int) '4');
        AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree9.getBalance(node25);
        aVLTree9.insert((int) (byte) 10);
        AVLTree aVLTree29 = new AVLTree();
        AVLTree.Node node31 = aVLTree29.find((int) '4');
        AVLTree.Node node33 = aVLTree29.find((int) 'a');
        AVLTree.Node node35 = aVLTree29.find((int) ' ');
        aVLTree29.delete((int) '4');
        AVLTree.Node node39 = aVLTree29.find((-1));
        AVLTree.Node node41 = aVLTree29.find((int) (byte) -1);
        int int42 = aVLTree29.height();
        int int43 = aVLTree29.height();
        AVLTree aVLTree44 = new AVLTree();
        AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        AVLTree.Node node54 = null;
        int int55 = aVLTree44.getBalance(node54);
        AVLTree aVLTree56 = new AVLTree();
        AVLTree.Node node58 = aVLTree56.find((int) '4');
        AVLTree.Node node60 = aVLTree56.find((int) 'a');
        AVLTree.Node node61 = aVLTree56.getRoot();
        aVLTree56.delete((int) (short) 10);
        AVLTree.Node node64 = aVLTree56.getRoot();
        AVLTree.Node node65 = aVLTree56.getRoot();
        AVLTree aVLTree66 = new AVLTree();
        AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        aVLTree66.insert((int) (byte) 100);
        aVLTree66.insert((int) 'a');
        AVLTree.Node node74 = aVLTree66.find((int) (byte) 100);
        int int75 = aVLTree56.getBalance(node74);
        int int76 = aVLTree44.getBalance(node74);
        aVLTree44.delete((int) (short) 10);
        AVLTree aVLTree79 = new AVLTree();
        AVLTree.Node node80 = null;
        int int81 = aVLTree79.getBalance(node80);
        aVLTree79.insert((int) (byte) 100);
        aVLTree79.insert((int) 'a');
        AVLTree.Node node87 = aVLTree79.find((int) (byte) 100);
        AVLTree.Node node88 = aVLTree79.getRoot();
        AVLTree.Node node89 = aVLTree79.getRoot();
        int int90 = aVLTree44.getBalance(node89);
        int int91 = aVLTree29.getBalance(node89);
        int int92 = aVLTree9.getBalance(node89);
        int int93 = aVLTree0.getBalance(node89);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AVLTree.Node node17 = aVLTree10.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        AVLTree.Node node23 = aVLTree19.find((int) 'a');
        AVLTree.Node node24 = aVLTree19.getRoot();
        AVLTree.Node node25 = aVLTree19.getRoot();
        AVLTree.Node node26 = aVLTree19.getRoot();
        aVLTree19.delete((int) (byte) 10);
        int int29 = aVLTree19.height();
        AVLTree.Node node31 = aVLTree19.find((int) (short) 10);
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        AVLTree aVLTree42 = new AVLTree();
        AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((int) 'a');
        AVLTree.Node node50 = aVLTree42.find((int) (byte) 100);
        AVLTree aVLTree51 = new AVLTree();
        AVLTree.Node node53 = aVLTree51.find((int) '4');
        aVLTree51.delete((int) 'a');
        AVLTree.Node node56 = aVLTree51.getRoot();
        aVLTree51.delete(0);
        AVLTree.Node node59 = null;
        int int60 = aVLTree51.getBalance(node59);
        int int61 = aVLTree51.height();
        AVLTree aVLTree62 = new AVLTree();
        AVLTree.Node node64 = aVLTree62.find((int) '4');
        AVLTree.Node node65 = aVLTree62.getRoot();
        aVLTree62.delete(100);
        aVLTree62.insert((int) (byte) 10);
        AVLTree.Node node70 = aVLTree62.getRoot();
        int int71 = aVLTree51.getBalance(node70);
        int int72 = aVLTree42.getBalance(node70);
        AVLTree.Node node73 = aVLTree42.getRoot();
        int int74 = aVLTree19.getBalance(node73);
        int int75 = aVLTree0.getBalance(node73);
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass78 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree aVLTree5 = new AVLTree();
        AVLTree.Node node7 = aVLTree5.find((int) '4');
        AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        AVLTree.Node node35 = aVLTree0.getRoot();
        AVLTree.Node node37 = aVLTree0.find(100);
        AVLTree.Node node39 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        int int19 = aVLTree0.getBalance(node18);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete(0);
        AVLTree.Node node25 = aVLTree0.find(100);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node25);
    }
}

