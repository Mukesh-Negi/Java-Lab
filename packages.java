/*          Packages in Java 

    There are 4 reasons to create a package :
1. To prevent name conflicts.
2. To control visibility.
3. To organise files.
4. 
*/
/*
 *              Creating packages
 * 1. Write : package p1.p2;
 * 2. javac -d . a.java
 * 3. java p1.p2.main
 */
package p1.p2;
class pkg
{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}