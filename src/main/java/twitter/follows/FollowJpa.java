package twitter.follows;

import javax.persistence.*;

@Entity
@Table(name="follows")
public class FollowJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="follower")
    private String follower;
    @Column(name="followee")
    private String followee;
    @Column(name="active")
    private boolean active;


    public FollowJpa(){}

    public FollowJpa(String follower, String followee, boolean active) {
        this.follower = follower;
        this.followee = followee;
        this.active = active;
    }


    public String getFollower() {
        return follower;
    }

    public String getFollowee() {
        return followee;
    }

    public boolean isActive() {
        return active;
    }

}
