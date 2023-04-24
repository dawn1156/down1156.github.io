package org.example.algorothm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimaryTask {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            List<Task> tasks = new ArrayList<>();
            while (true) {
                String value = in.nextLine();
                if ("".equals(value)) {
                    break;
                }
                String[] valueArr = value.split(" ");
                String id = valueArr[0];
                Long pro = Long.parseLong(valueArr[1]);
                Long excTime = Long.parseLong(valueArr[2]);
                Long adrTime = Long.parseLong(valueArr[3]);
                tasks.add(new Task(id, pro, excTime, adrTime));
            }
            PriorityQueue<Task> queue = new PriorityQueue<>();
            long time = 0;
            for (Task task : tasks) {
                long h = task.startTime - time;
                while (!queue.isEmpty() && h > 0) {
                    if (queue.peek().excTime<=h) {
                        Task tmp = queue.poll();
                        h= h-tmp.excTime;
                        time = time+tmp.excTime;
                        System.out.println(tmp.id+" "+time);
                    } else {
                        Task tmp = queue.peek();
                        tmp.excTime -=h;
                        time +=h;
                        break;
                    }
                }
                if (time < task.startTime) {
                    time = task.startTime;
                }
                queue.add(task);
            }
            while (!queue.isEmpty()) {
                Task t =queue.poll();
                time += t.excTime;
                System.out.println(t.id+" "+time);
            }
        }
        static class Task implements Comparable<Task> {
            String id;
            Long pro;
            Long excTime;
            Long startTime;
            public Task(String id, Long pro, Long excTime, Long startTime) {
                this.id = id;
                this.pro = pro;
                this.excTime = excTime;
                this.startTime = startTime;

            }
            @Override
            public int compareTo(Task o) {
                // 返回-1 是上面，1是下面，相等的时候谁来的早放上面
                if (this.pro>o.pro) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
