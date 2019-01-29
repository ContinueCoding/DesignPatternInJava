package com.huoxy.c3_interpreter_pattern_16.example2;

import java.util.Stack;

//计算器 - 根据Node解释算式
public class Calculator {
    private String statement;
    private Node node;

    /**
     * 根据算式字符串构造Node - 暂时支持乘、除、求模
     *
     * @param statement 算式
     *                  例如：String statement = "3 * 2 * 4 / 6 % 5";
     */
    public void build(String statement) {
        Node left = null, right = null;
        Stack stack = new Stack();

        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MultiplyNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivideNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node = (Node) stack.pop();
    }

    /**
     * 计算结果
     *
     * @return 结果
     */
    public int compute() {
        return node.interpret();
    }

}
