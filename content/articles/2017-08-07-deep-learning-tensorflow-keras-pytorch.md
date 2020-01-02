---
title: Deep Learning Tensorflow vs Keras vs PyTorch
author: Akarsh Singh
type: post
date: 2017-08-07T12:07:59+00:00
url: /deep-learning-tensorflow-keras-pytorch/
featured_image: /wp-content/uploads/2017/08/deep-learning.png
ampforwp-amp-on-off:
  - default
ampforwp-redirection-on-off:
  - enable
categories:
  - Deep Learning
  - Tensorflow
tags:
  - Deep learning
  - Keras
  - Machine Learning
  - python
  - PyTorch
  - Tensorflow

---
### What is Deep Learning?

Deep learning is the application of artificial neural networks (ANNs) to learn tasks. These tasks contain more than one hidden layer. Deep learning is part of a broader family of machine learning. Machine learning itself is a part of Artificial Intelligence(AI). It is something like this

**Artificial Intelligence > Machine Learning > Deep Learning**

Machine Learning at its least is the practice of using algorithms to read data, learn from it, and then make a determination or prediction about something in the world. So instead of writing instructions for each and every task that you wish to accomplish, the machine is &#8220;trained&#8221; using large amounts of data and algorithms. This gives machines the ability to learn and perform the task.

Another algorithmic approach is Artificial Neural Networks. Neural Networks are inspired by the biology of our brain – neurons, their interconnections and transfer of response through an electric impulse. But unlike a biological brain, these artificial neural networks have discrete layers, connections, and directions of data propagation.

<img class="aligncenter size-full wp-image-231" src="http://codeinpython.com/tutorials/wp-content/uploads/2017/08/NeuralNetwork-640x374.png" alt="deep learning" width="640" height="374" srcset="http://codeinpython.com/tutorials/wp-content/uploads/2017/08/NeuralNetwork-640x374.png 640w, http://codeinpython.com/tutorials/wp-content/uploads/2017/08/NeuralNetwork-640x374-300x175.png 300w" sizes="(max-width: 640px) 100vw, 640px" />

In future articles, we will talk more about Machine Learning, Deep Learning, and Neural Networks. In this article, we will compare different Deep Learning Frameworks available. Machine Learning practitioners already are familiar with scikit-learn, a machine learning library with all supervised and unsupervised machine learning algorithms. One aspect where scikit-learn fails to perform is neural networks. Many tech giants like Google and Facebook have released their own deep learning libraries like Tensorflow, PyTorch, etc.

### Tensorflow

TensorFlow is an open-source software library for machine learning for a range of tasks. TensorFlow was originally developed by the Google Brain team for internal Google use before being released under the Apache 2.0 open source license on November 9, 2015. It is currently used for both research and production at Google products.

If you want to peek inside the hood, here is the Github repository
  
<https://github.com/tensorflow/tensorflow>

#### Advantages

**1. Community Engagement is good:** A large number of developers and students are now interested in deep learning because they heard about TensorFlow. Everyone in the machine learning community is aware of TensorFlow. Most of them are open to trying it, and hopefully, there will be a lot of useful products based on this library.
  
**2. Flexible:** You need to express your computation as a data flow graph in order to use TensorFlow. The architecture of TensorFlow is highly modular. This gives the flexibility to create multiple models or multiple versions of the same model.
  
**3. Portable:** It runs on GPUs, CPUs, desktops, servers, and mobile computing platforms. You can deploy a trained model on your mobile as a part of your product. Google has announced to launch Tensorflow Lite for Android devices.
  
**4. Performance:** TensorFlow allows you to make the most of your available hardware with its advanced support for threads, asynchronous computation, and queues.

### Keras

Keras is an open source neural network library written in Python. It is more of a front-end library, unlike Tensorflow which is a back-end library. It is capable of running on top of other Machine and Deep Learning libraries like MXNet, Deeplearning4j, Tensorflow, CNTK or Theano.

#### Advantages:

1. Designed to enable fast experimentation with deep neural networks
  
2. It focuses on being minimal, modular and extensible.
  
3. It presents a higher-level, more intuitive set of abstractions that make it easy to configure neural networks regardless of the backend computing library.
  
4. The library contains various implementations of commonly used neural network building blocks such as layers, objectives, activation functions, optimizers. It has tools to make working with image and text data easier.

People have reported that the documentation is not enough to understand Keras easily. If you wish to look under the hood. Check this Github repository.
  
<https://github.com/fchollet/keras/tree/master/keras>

### PyTorch

PyTorch is in early-release Beta as of writing this article. PyTorch claims to be a deep learning framework that puts Python first. Currently, PyTorch is only available in Linux and OSX operating system. It supports three versions of Python specifically Python 2.7, 3.5 and 3.6 and is developed by these companies and universities.

<img class="aligncenter size-full wp-image-233" src="http://codeinpython.com/tutorials/wp-content/uploads/2017/08/Capture.png" alt="Pytorch " width="1031" height="612" srcset="http://codeinpython.com/tutorials/wp-content/uploads/2017/08/Capture.png 1031w, http://codeinpython.com/tutorials/wp-content/uploads/2017/08/Capture-300x178.png 300w, http://codeinpython.com/tutorials/wp-content/uploads/2017/08/Capture-768x456.png 768w, http://codeinpython.com/tutorials/wp-content/uploads/2017/08/Capture-1024x608.png 1024w" sizes="(max-width: 1031px) 100vw, 1031px" />

#### Difference between PyTorch and TensorFlow

TensorFlow is built around a concept of Static Computational Graph (SCG). That means, first you define everything that is going to happen inside your framework, then you run it.

A network written in PyTorch is a Dynamic Computational Graph (DCG). It has following advantages
  
1. Dynamic data structures inside the network. You can have any number of inputs at any given point of training in PyTorch.
  
2. Networks are modular. Each part is implemented separately, and you can debug it separately.

You can explore PyTorch Github repository from this link
  
<https://github.com/pytorch>

### Conclusion

In the end, I would suggest that to perform supervised, semi-supervised and unsupervised learning task stick to scikit-learn. Scikit-learn has a great interface to support such algorithms. But it does not support neural networks and deep learning algorithms and this is where above-mentioned libraries come in. Even though it totally depends on you and your project to select which framework suits best. My recommendation would be Tensorflow solely because it is developed and maintained by Google and other AI related industries will adopt this in their product.
  
**Subscribe to the newsletter and get notified when a new article drops.**

If you are **new to Python** consider reading these articles

<a href="http://codeinpython.com/tutorials/learn-variables-python/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/learn-variables-python/</a>

<a href="http://codeinpython.com/tutorials/learn-python-list-built-functions/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/learn-python-list-built-functions/</a>

<a href="http://codeinpython.com/tutorials/for-loop-python/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/for-loop-python/</a>

<a href="http://codeinpython.com/tutorials/learn-classes-objects-python/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/learn-classes-objects-python/</a>

If you are already familiar with Python then consider these **NumPy tutorials** to start your Machine Learning journey.

<a href="http://codeinpython.com/tutorials/learn-numpy-array-operations/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/learn-numpy-array-operations/</a>

<a href="http://codeinpython.com/tutorials/getting-started-numpy/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/getting-started-numpy/</a>

<a href="http://codeinpython.com/tutorials/numpy-array-indexing-slicing/" target="_blank" rel="noopener">http://codeinpython.com/tutorials/numpy-array-indexing-slicing/</a>

**Sources:**

<https://blogs.nvidia.com/blog/2016/07/29/whats-difference-artificial-intelligence-machine-learning-deep-learning-ai/>

<https://en.wikipedia.org/wiki/Deep_learning>

<https://en.wikipedia.org/wiki/TensorFlow>

<https://en.wikipedia.org/wiki/Keras>

<http://pytorch.org/>