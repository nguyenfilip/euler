package net.nguyen;

import java.io.IOException;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.codepoetics.protonpack.StreamUtils;

public class Task21 {
	public static void main(String[] args) throws IOException {
		SimpleFileCharacterProvider fcp = new SimpleFileCharacterProvider(Task21.class.getResourceAsStream("/p022_names.txt"));
		
		SortedSet<ValuedWord> vvSet = new TreeSet<>();
		ValuedWordIterator vvIterator = new ValuedWordIterator(fcp);
		
		 
		Stream<Integer> values = vvIterator.stream()
		.collect(Collectors.toCollection(TreeSet::new)).stream()
		.map(vv->vv.getChachedValue());
		
		System.out.println(
				StreamUtils.zip(values, Stream.iterate(1, a->a+1), (a,b)-> a*b).reduce((a,b)->a+b));
		
	}
}
