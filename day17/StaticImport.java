/*
StaticImport  ��̬����     ����ʹ�ã� ��import static �ٵ�������������
ע��������������ĺ������߷�����ô��Ҫд������������

*/

// �����д��˼·������һ��int���͵����飬Ȼ����sort��������Ϊ���ֲ�����׼����Ȼ����toStringתΪ�ַ��������

import java.util.*;
import static java.util.Arrays.*;
import static java.lang.System.*;

class  StaticImport
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,9,4,3};
		sort(arr);
		int index = binarySearch(arr,4);
		out.println(Arrays.toString(arr));
		out.println(index);
//		System.out.println("Hello World!");
	}
}
