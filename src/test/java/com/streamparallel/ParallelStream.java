package com.streamparallel;
import java.util.Arrays;
import java.util.List;
class Student{
	String name;
	int score;
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}
public class ParallelStream {

	public static void main(String[] args) {
		List<Student> studentList=Arrays.asList(
				new Student("David",82),
				new Student("Sachin",97),
				new Student("Rohit",67),
				new Student("Virat",99),
				new Student("Dhini",58),
				new Student("Surya",60),
				new Student("Hardik",85)
				);
		// Stream Sequential
		System.out.println("Stream Sequential");
		studentList.stream().filter(s->s.getScore()>80)
		.limit(3).forEach(s->System.out.println(s.getName()+" : "+s.getScore()));
		//parallel Stream
		System.out.println("parallel Stream....");
		studentList.parallelStream().filter(s->s.getScore()>80)
		.limit(3).forEach(s->System.out.println(s.getName()+" : "+s.getScore()));	
		
		//convert stream()--> parallelStream
		System.out.println("convert stream()--> parallelStream");
		studentList.stream().parallel().filter(s->s.getScore()>80)
		.limit(3).forEach(s->System.out.println(s.getName()+" : "+s.getScore()));
	}

}
