public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return (0.5 * mass) * (velocity * velocity);
    }
    double potentialEnergy (float mass, gravity, float height){
        return mass * gravity * height;
    }
    double force (float mass, gravity){
        return mass * gravity;
    }
    double momentum(float mass, float velocity){
        return mass * velocity;
    }
    double velocity(float distance, float time){
        return distance / time;
    }
}
