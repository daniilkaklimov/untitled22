package com.company;

public class Wall extends Barrier {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    protected boolean moving(Human human) {
        System.out.println("The wall " + super.getName() + "height: " + this.height);
        human.jump();
        if (this.getHeight() <= human.getJumpHeight()) {
            System.out.println("Human jump success");
            return true;
        } else {
            System.out.println("Human jump unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println("The wall " + super.getName() + "height: " + this.height);
        robot.jump();
        if (this.getHeight() <= robot.getJumpHeight()) {
            System.out.println("Robot jump success");
            return true;
        } else {
            System.out.println("Robot jump unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println("The wall " + super.getName() + " height: " + this.height);
        cat.jump();
        if (this.getHeight() <= cat.getJumpHeight()) {
            System.out.println("Cat jump success");
            return true;
        } else {
            System.out.println("Cat jump unsuccessfully");
            return false;
        }
    }
}
