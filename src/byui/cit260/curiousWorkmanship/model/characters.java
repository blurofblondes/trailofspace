/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author Travis
 */
public enum characters implements Serializable {

    Player("This is the space venturer who is fighting space aliens to return home.", "Kyle"),
    EnemyOne("This is the first space alien you must defeat to continue on.", "Quinn"),
    EnemyTwo("This is the second space alien you must defeat to continue on.", "Olive"),
    EnemyThree("This is the third space alien you must defeat to continue on.", "Paige"),
    MainBoss("This is the worst guy, baddest enemy that you must fight to return home.", "Travis");

    private final String description;
    private final Point coordinates;
    private final String characterName;

    characters(String description, String characterName) {
        this.description = description;
        coordinates = new Point(1, 1);
        this.characterName = characterName;
    }


    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "characters{" + "characterName=" + characterName + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

}
