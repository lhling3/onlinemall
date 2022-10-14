package com.ling.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @Created: with IntelliJ IDEA.
 * @author: Ling
 * @createTime: 2022-05-03
 **/
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set = new HashSet<Integer>();

    /**
     * 初始化方法
     * @param constraintAnnotation
     */

    public void initialize(ListValue constraintAnnotation) {

        int[] vals = constraintAnnotation.vals();

        for (int val : vals) {
            set.add(val);
        }

    }

    /**
     * 判断是否效验成功
     * @param value 需要效验的值
     * @param context
     * @return
     */

    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        //判断是否有包含的值
        boolean contains = set.contains(value);

        return contains;
    }

}
