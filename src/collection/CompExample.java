package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TeamMember implements Comparable<TeamMember>{
    private int id;
    private String name;

    public TeamMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(TeamMember o) {

        if(this.id> o.id){
            return 1;
        } else if (this.id<o.id) {
            return -1;
        }else
            return 0;

        //return this.name.compareTo(o.name); for string we can use already existing compareTo method of string
        // above is ascending order sort and if you want descending o.name.compareTo(this.name) use this
    }
}

public class CompExample {
    public static void main(String[] args) {

        List<TeamMember> myTeam = new ArrayList<>();
        myTeam.add(new TeamMember(1,"Priyanshi"));
        myTeam.add(new TeamMember(2,"Romil"));
        myTeam.add(new TeamMember(5,"Sagarr"));
        myTeam.add(new TeamMember(3,"Kuhee"));
        myTeam.add(new TeamMember(6,"Gayatri"));

        Collections.sort(myTeam);
        System.out.println(myTeam);

    }
}


/*
 Comparable & Comparator interfaces and both of these are used to sort the elements
 // Comparable interface has compareTo method for example we have list<String> then it sort
//based on existing sorting method implemented in String which is implemented by Comparable interface
//when we have custom object with us and we want to do sorting we need to use Comparable Interface's
compareTo metthod
// when we use Comparable's compareTo method what we do is we do changes in Object class by implementinh
our custom compareTo method but this way of changing in class is a problem
and so we need a mechanism where we dont need to change the code so we have Comparator Interface //
//Comparable = to be used only for Natural Order sorting
// Comparator = if you want elements to be sorted based on attributes other than id
 */


