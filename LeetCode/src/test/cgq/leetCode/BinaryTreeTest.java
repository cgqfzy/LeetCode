package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.BinaryTree;
import com.cgq.leetCode.BinaryTree.TreeNode;

public class BinaryTreeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.new TreeNode(1);
		
		TreeNode rootLeft = bt.new TreeNode(2);
		TreeNode rootRight = bt.new TreeNode(3);
		root.setLeft(rootLeft);
		root.setRight(rootRight);
		TreeNode rootLeftLeft = bt.new TreeNode(4);
		TreeNode rootLeftRigth = bt.new TreeNode(5);
		rootLeft.setLeft(rootLeftLeft);
		rootLeft.setRight(rootLeftRigth);
		TreeNode rootRightLeft = bt.new TreeNode(6);
		TreeNode rootRihtRight = bt.new TreeNode(7);
		rootRight.setLeft(rootRightLeft);
		rootRight.setRight(rootRihtRight);
		
		bt.printTree(root, 0);
		List<Integer> result = bt.preorderTraversal(root);
		System.out.println(result.size());
		Iterator<Integer> rIt = result.iterator();
		while (rIt.hasNext()) {
			System.out.println(rIt.next());
		}
		
	}

}
