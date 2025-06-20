class Duplicate_values {
	public static void main(String[] args) {
		int a[] = {2, 3, 6, 2, 8, 2, 9, 9, 9};
		int i, j;
		for (i = 0; i < a.length; i++) {
			boolean flag = false;
			for (j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					flag = true;
					break;
				}
			}
			if (flag)
				continue;

			for (j = i + 1; j < a.length; j++) 
			{ 
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
